package com.example.springsession.service;

import com.example.springsession.dto.Product;
import com.example.springsession.dto.ProductRequest;
import com.example.springsession.dto.ProductResponse;

public interface ProductService {
    ProductResponse searchProduct(ProductRequest productRequest);
}
