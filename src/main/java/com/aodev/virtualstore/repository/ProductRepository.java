package com.aodev.virtualstore.repository;

import com.aodev.virtualstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
