package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.config.jwt.JwtProvider;
import com.sem2.sem2_project.dto.request.CartRequest;
import com.sem2.sem2_project.dto.response.CartResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.Cart;
import com.sem2.sem2_project.model.Product;
import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.repository.CartRepository;
import com.sem2.sem2_project.repository.ProductRepository;
import com.sem2.sem2_project.repository.UserRepository;
import com.sem2.sem2_project.service.AuthenticationService;
import com.sem2.sem2_project.service.CartService;
import io.jsonwebtoken.Claims;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final JwtProvider jwtProvider;
    private final AuthenticationService authenticationService;

    @Override
    public CartResponse addToCart(CartRequest cartRequest) {
        User user = authenticationService.getCurrenAuthenticatedUser();

        Product product = productRepository.findById(cartRequest.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        Cart cart = new Cart();
        cart.setUser(user);
        cart.setProduct(product);
        cart.setQuantity(cartRequest.getQuantity());

        CartResponse cartResponse = BasicMapper.INSTANCE.toCartResponse(cartRepository.save(cart));
        cartResponse.setUserId(user.getId());
        cartResponse.setProductId(product.getId());
        cartResponse.setProductName(product.getName());
        cartResponse.setQuantity(cartRequest.getQuantity());
        return cartResponse;
    }

    @Override
    public List<CartResponse> getAllCartsByUserId() {
        User user = authenticationService.getCurrenAuthenticatedUser();

        List<Cart> cartList = cartRepository.findByUserId(user.getId());
        List<CartResponse> cartResponseList = new ArrayList<>();
        for (Cart cart : cartList) {
            CartResponse cartResponse = new CartResponse();
            cartResponse.setUserId(user.getId());
            cartResponse.setProductId(cart.getProduct().getId());
            cartResponse.setProductName(cart.getProduct().getName());
            cartResponse.setQuantity(cart.getQuantity());

            double price = cart.getProduct().getPrice();
            cartResponse.setPrice(price);

            double total = cart.getQuantity() * price;
            cartResponse.setTotalPrice(total);

            cartResponseList.add(cartResponse);
        }
        return cartResponseList;
    }

    @Override
    public boolean updateCart(CartRequest cart) {
        return false;
    }

    @Override
    public String deleteCart(int id) {
        Cart cart = cartRepository.findById(id).orElseThrow(() -> new RuntimeException("Cart not found"));
        cartRepository.delete(cart);
        return "Deleted";
    }

}
