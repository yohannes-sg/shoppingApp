package com.minishop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minishop.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}