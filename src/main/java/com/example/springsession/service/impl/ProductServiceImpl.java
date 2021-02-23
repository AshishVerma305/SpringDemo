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
        String q= "stockLocation:"+"\""+ productRequest.getLocationBaseProducts()+"\"";


            // call searchClient.getProduct with q=location: +  productRequest.getLocation()
        // parse the response and stitch the rsponse in response i.e respose.setLocat..(product2)
        Map<String,Object> product2 = searchClient.getProduct(q);
        List<LinkedHashMap<String,Object>> location = (List<LinkedHashMap<String, Object>>) ((Map)product2.get("response")).get("docs");
        List<Product> productDTOs2 = new ArrayList<>();
        for (LinkedHashMap<String,Object> k : l)
        {
            Product product=new Product();
            product.setDescription((String) k.get("description"));

            product.setInStock((int) k.get("isInStock") == 1? true: false );
            product.setTitle((String)k.get("nameSearch") );
            product.setSalesPrice(((Double)k.get("offerPrice")).intValue());
            productDTOs2.add(product);
        }
        response.setProductList(productDTOs);
        response.setLocationBasedProducts(productDTOs2);
        return response;
    }
}
