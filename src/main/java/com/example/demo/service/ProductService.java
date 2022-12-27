package com.example.demo.service;

import com.example.demo.domain.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product saveProduct(@Valid Product product){
//        if(product == null) throw new RuntimeException("product is null");
//        if(product.getId() != null) throw  new RuntimeException("product id shouldn't be set");
//        if(productRepository.existsById(product.getId()) == true) throw new RuntimeException("id exists");
        return productRepository.save(product);

    }
}
