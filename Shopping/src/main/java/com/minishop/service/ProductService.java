package com.minishop.service;

import java.util.List;

import com.minishop.model.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	Product getProductById(Long id);

	void saveProduct(Product product);

	void updateProduct(Product product);

	void deleteProduct(Long id);
}