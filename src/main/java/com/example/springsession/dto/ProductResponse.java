package com.example.springsession.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductResponse {
    private List<Product> productList;
    public ProductResponse()
    {

    }
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
