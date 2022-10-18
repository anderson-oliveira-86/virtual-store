package com.aodev.virtualstore.controller;

import com.aodev.virtualstore.model.Product;
import com.aodev.virtualstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product productRequest){
        return ResponseEntity.ok(productService.create(productRequest));
    }

}
