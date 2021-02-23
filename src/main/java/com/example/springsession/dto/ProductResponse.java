package com.example.springsession.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductResponse {
    private List<Product> productList;
    private List<Product> locationBasedProducts;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getLocationBasedProducts() {
        return locationBasedProducts;
    }

    public void setLocationBasedProducts(List<Product> locationBasedProducts) {
        this.locationBasedProducts = locationBasedProducts;
    }
}
