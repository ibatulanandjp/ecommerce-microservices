package com.ibatulanand.productservice.repository;

import com.ibatulanand.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
