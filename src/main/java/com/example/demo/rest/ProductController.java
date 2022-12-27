package com.example.demo.rest;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@RestController
@RequestMapping("/private")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        System.out.println(product);
        return ResponseEntity.ok(productService.saveProduct(product));
    }

}
