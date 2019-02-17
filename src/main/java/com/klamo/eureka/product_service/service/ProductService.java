package com.klamo.eureka.product_service.service;

import com.klamo.eureka.product_service.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> productList();

    Product findById(int id);
}
