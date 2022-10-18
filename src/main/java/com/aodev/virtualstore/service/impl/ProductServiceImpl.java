package com.aodev.virtualstore.service.impl;

import com.aodev.virtualstore.model.Product;
import com.aodev.virtualstore.repository.ProductRepository;
import com.aodev.virtualstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }
}
