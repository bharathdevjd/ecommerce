package com.myprojects.product_service.service;

import com.myprojects.product_service.dto.ProductResponse;
import com.myprojects.product_service.dto.Productrequest;
import com.myprojects.product_service.model.Product;
import com.myprojects.product_service.repository.ProdutRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class ProductService {

    private final ProdutRepository produtRepository;


    //Bug fix 1
    //Bug fix 2
    //Bug fix 3
    public void createProduct(Productrequest productrequest) {
        Product product = Product.builder().
                name(productrequest.getName()).
                description(productrequest.getDescription()).
                price(productrequest.getPrice())
                .build();

        produtRepository.save(product);

        log.info("product {} is saved", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = produtRepository.findAll();

        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }

}
