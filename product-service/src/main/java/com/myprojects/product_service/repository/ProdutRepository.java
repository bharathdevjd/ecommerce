package com.myprojects.product_service.repository;

import com.myprojects.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutRepository extends MongoRepository<Product, String> {
}
