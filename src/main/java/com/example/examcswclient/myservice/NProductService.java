package com.example.examcswclient.myservice;

import com.example.examcswclient.service.ProductService;
import com.example.examcswclient.service.ProductServiceService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class NProductService {
    @Bean
    public ProductService productService(){
        ProductServiceService productServiceService = new ProductServiceService();
        ProductService service = productServiceService.getProductServicePort();
        return service;
    }
}
