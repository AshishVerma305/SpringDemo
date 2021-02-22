package com.example.springsession.dto;

import java.util.ArrayList;

public class ProductRequest
{
    private String searchTerm;
    public ProductRequest()
    {

    }
    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Override
    public String toString() {
        return "ProductRequest{" +
                "searchTerm='" + searchTerm + '\'' +
                '}';
    }
}
