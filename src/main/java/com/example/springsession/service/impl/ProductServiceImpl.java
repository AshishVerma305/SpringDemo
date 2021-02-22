package com.example.springsession.service.impl;

import com.example.springsession.dto.Product;
import com.example.springsession.dto.ProductRequest;
import com.example.springsession.dto.ProductResponse;
import com.example.springsession.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductResponse searchProduct(ProductRequest productRequest)
    {
        ProductResponse response=new ProductResponse();
        Product product=new Product();
        product.setInStock(true);
        product.setDescription("Ok");
        product.setTitle("Samsung");
        product.setSalesPrice(10000);
        response.setProductList(Arrays.asList(product));
        return response;
    }
}
