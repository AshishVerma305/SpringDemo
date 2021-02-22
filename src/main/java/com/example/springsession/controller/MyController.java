package com.example.springsession.controller;

import com.example.springsession.dto.ProductRequest;
import com.example.springsession.dto.ProductResponse;
import com.example.springsession.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
    @Autowired
    ProductService productService;
    @PostMapping(value="/search")
    public ProductResponse searchMethod(@RequestBody ProductRequest request)
    {
        return productService.searchProduct(request);
    }
}
