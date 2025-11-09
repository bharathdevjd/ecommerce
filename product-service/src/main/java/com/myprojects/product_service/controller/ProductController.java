package com.myprojects.product_service.controller;

import com.myprojects.product_service.dto.ProductResponse;
import com.myprojects.product_service.dto.Productrequest;
import com.myprojects.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Productrequest productrequest) {
        productService.createProduct(productrequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<ProductResponse> getAllProducts() {
       return productService.getAllProducts();
    }
}
