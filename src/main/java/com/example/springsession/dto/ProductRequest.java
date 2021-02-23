package com.example.springsession.dto;

import java.util.ArrayList;

public class ProductRequest
{
    private String searchTerm;
    private String locationBaseProducts;
    public ProductRequest()
    {

    }
    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String getLocationBaseProducts() {
        return locationBaseProducts;
    }

    public void setLocationBaseProducts(String locationBaseProducts) {
        this.locationBaseProducts = locationBaseProducts;
    }

    @Override
    public String toString() {
        return "ProductRequest{" +
                "searchTerm='" + searchTerm + '\'' +
                '}';
    }
}
