package com.example.springsession.service.impl;

import com.example.springsession.client.SearchClient;
import com.example.springsession.dto.Product;
import com.example.springsession.dto.ProductRequest;
import com.example.springsession.dto.ProductResponse;
import com.example.springsession.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private SearchClient searchClient;
    @Override
    public ProductResponse searchProduct(ProductRequest productRequest)
    {
        Map<String,Object> product1 = searchClient.getProduct(productRequest.getSearchTerm());
        List<LinkedHashMap<String,Object>> l = (List<LinkedHashMap<String, Object>>) ((Map)product1.get("response")).get("docs");
        ProductResponse response=new ProductResponse();
        List<Product> productDTOs = new ArrayList<>();
        for (LinkedHashMap<String,Object> k : l)
        {
            Product product=new Product();
            product.setDescription((String) k.get("description"));

            product.setInStock((int) k.get("isInStock") == 1? true: false );
            product.setTitle((String)k.get("nameSearch") );
            product.setSalesPrice(((Double)k.get("offerPrice")).intValue());
            productDTOs.add(product);
        }

        response.setProductList(productDTOs);
        return response;
    }
}
