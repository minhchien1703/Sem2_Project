package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.CartRequest;
import com.sem2.sem2_project.dto.request.ProductRequest;
import com.sem2.sem2_project.dto.response.CartResponse;
import com.sem2.sem2_project.dto.response.ColorResponse;
import com.sem2.sem2_project.dto.response.ProductResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.model.enums.CartStatus;
import com.sem2.sem2_project.model.enums.ProductStatus;
import com.sem2.sem2_project.repository.CartRepository;
import com.sem2.sem2_project.repository.ColorRepository;
import com.sem2.sem2_project.repository.ImageRepository;
import com.sem2.sem2_project.repository.ProductRepository;
import com.sem2.sem2_project.repository.projection.CartProjection;
import com.sem2.sem2_project.service.AuthenticationService;
import com.sem2.sem2_project.service.CartService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
    private static final Logger log = LoggerFactory.getLogger(CartServiceImpl.class);
    private final CartRepository cartRepository;
    private final ProductRepository productRepository;
    private final AuthenticationService authenticationService;
    private final ImageRepository imageRepository;

    @Override
    public String addToCart(CartRequest request, User user) {
        Product product = null;
        if (request.getColorId() > 0) {
            product = productRepository.findByProductIdColorIdSizeId(request.getProductId(), request.getColorId(), request.getSizeId());
        } else {
            product = productRepository.findById(request.getProductId())
                    .orElseThrow(() -> new RuntimeException("Product not found"));
        }

        if (product.getStatus().equals(ProductStatus.OUT_OF_STOCK)) {
            return "The product is out of stock";
        }

        Cart cart = cartRepository.findCartByProductIdAndUserId(product.getId(), user.getId());
        if (cart != null && cart.getStatus().equals(CartStatus.ACTIVE)) {
            return "The product is already in the cart!";
        }

        if (cart != null && cart.getStatus().equals(CartStatus.DELETED)) {
            cart.setStatus(CartStatus.ACTIVE);
            cartRepository.save(cart);
            return "Cart successfully added to the cart";
        }

        if(cart == null) {
            cart = new Cart();
            cart.setUser(user);
            cart.setProduct(product);
            cart.setStatus(CartStatus.ACTIVE);
            if (request.getQuantity() > 0) {
                cart.setQuantity(request.getQuantity());
            } else {
                cart.setQuantity(1);
            }
            cart.setSubTotal(product.getPrice() * cart.getQuantity());
            cartRepository.save(cart);
            return "Cart successfully added to the cart";
        }

        return "Cart already exists!";
    }

    @Override
    public List<CartResponse> getAllCartsByUserId() {
        User user = authenticationService.getCurrenAuthenticatedUser();
        List<Cart> carts = cartRepository.findCartByUserId(user.getId(), CartStatus.ACTIVE);

        List<CartResponse> cartResponses = new ArrayList<>();
        for (Cart cart : carts) {
            CartResponse cartRes = new CartResponse();
            Optional<Product> product = productRepository.findById(cart.getProduct().getId());
            if (product.isPresent()) {
                ProductResponse productRes = BasicMapper.INSTANCE.toProductResponse(product.get());
                productRes.setStatus(product.get().getStatus());

                Images image = imageRepository.findImagesByProductId(product.get().getId());
                if (image != null) {
                    productRes.setImage(image.getUrl());
                }
                cartRes.setId(cart.getId());
                cartRes.setQuantity(cart.getQuantity());
                cartRes.setProduct(productRes);
                cartResponses.add(cartRes);
            }
        }
        return cartResponses;
    }



    @Transactional
    @Override
    public String deleteProductFromCart(int productId, int userId) {
        Cart cart = cartRepository.findCartByProductIdAndUserId(productId, userId);
        cart.setStatus(CartStatus.DELETED);
        cartRepository.save(cart);
        return "Delete cart successfully";
    }

    @Override
    public String updateCartItemQuantity(CartRequest cartRequest) {
        User user = authenticationService.getCurrenAuthenticatedUser();
        Cart cart = cartRepository.findCartByProductIdAndUserId(cartRequest.getProductId(), user.getId());
        cart.setQuantity(cartRequest.getQuantity());
        cartRepository.save(cart);
        return "Cart successfully updated";
    }


}
