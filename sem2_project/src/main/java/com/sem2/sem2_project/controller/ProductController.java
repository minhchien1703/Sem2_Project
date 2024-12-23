package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.ProductPriceRequest;
import com.sem2.sem2_project.dto.request.ProductRequest;
import com.sem2.sem2_project.dto.response.ProductResponse;
import com.sem2.sem2_project.model.enums.TypeProducts;
import com.sem2.sem2_project.service.CloudinaryService;
import com.sem2.sem2_project.service.EmailService;
import com.sem2.sem2_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    private final ProductService productService;
    private final CloudinaryService cloudinaryService;
    private final EmailService emailService;

    @PostMapping(value = "/add", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ProductResponse> addProduct(@RequestPart("jsonData") ProductRequest productRequest,
                                                      @RequestPart("files") List<MultipartFile> files) {
        try{
            productRequest.setImages(cloudinaryService.uploadFiles(files));}
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok(productService.addProduct(productRequest));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductResponse>> getProducts() {
        //emailService.sendOrderConfirmation("sonnt0212@gmail.com","testing");
        return ResponseEntity.ok(productService.getProducts());
    }

    @PostMapping(value = "/add")
    public ResponseEntity<ProductResponse> addProduct(@RequestBody ProductRequest productRequest) {
        return ResponseEntity.ok(productService.addProduct(productRequest));
    }

    @GetMapping("/popular")
    public ResponseEntity<List<ProductResponse>> getAllProducts(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "limit", defaultValue = "5") int limit
    ) {
        Pageable pageable = PageRequest.of(page, limit);
        String type = TypeProducts.POPULAR.name();
        return ResponseEntity.ok(productService.getProductByTypePopular(type, pageable));
    }

    @GetMapping("/getByPrice")
    public ResponseEntity<List<ProductResponse>> getProductsByPrice(@RequestBody ProductPriceRequest request) {
        return ResponseEntity.ok(productService.getProductByPrice(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable int id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<ProductResponse>> getProductsByCategory(@PathVariable int categoryId) {
        return ResponseEntity.ok(productService.getProductByCategory(categoryId));
    }

    @GetMapping("/room/{roomId}")
    public ResponseEntity<List<ProductResponse>> getProductsByRoomId(@PathVariable int roomId) {
        return ResponseEntity.ok(productService.getProductByRoomId(roomId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductResponse> updateProduct(@PathVariable int id, @RequestBody ProductRequest productRequest) {
        return ResponseEntity.ok(productService.updateProduct(id, productRequest));
    }

    @PutMapping(value ="/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ProductResponse> updateProduct(@PathVariable int id, @RequestPart("jsonData") ProductRequest productRequest,
                                                         @RequestPart("files") List<MultipartFile> files) {
        try{
            productRequest.setImages(Stream.concat(productRequest.getImages().stream(),cloudinaryService.uploadFiles(files).stream()).collect(Collectors.toList()));
            }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok(productService.updateProduct(id, productRequest));
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "Product deleted";
    }

    @GetMapping("/related/{categoryId}")
    public ResponseEntity<List<ProductResponse>> getRelatedProducts(@PathVariable("categoryId") Integer categoryId) {
        return ResponseEntity.ok(productService.getProductByRelated(categoryId));
    }

    @GetMapping("/page/{page}")
    public ResponseEntity<List<ProductResponse>> getProductsByPage(@PathVariable("page") int page) {
        return ResponseEntity.ok(productService.getProductPages(page));
    }

}
