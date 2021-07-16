package com.example.examcswclient.api;

import com.example.examcswclient.service.Product;
import com.example.examcswclient.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductApi {
    @Autowired
    ProductService productService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Product> getAll(Product product){
        return productService.getList();
    }
    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product){
        productService.save(product);
        return product;
    }
}
