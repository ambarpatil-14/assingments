package com.example.productcatalog.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productcatalog.model.Product;
import com.example.productcatalog.repository.ProductRepository;
import com.example.productcatalog.service.ProductService;

@Service("productService")
public class ProductServiceIMPL implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product getProduct(long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public List<Product> save(Product product) {
		productRepository.save(product);
		return (List<Product>) productRepository.findAll();
	}

}
