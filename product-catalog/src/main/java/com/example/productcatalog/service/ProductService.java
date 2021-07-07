package com.example.productcatalog.service;

import java.util.List;

import com.example.productcatalog.model.Product;

public interface ProductService {

	Product getProduct(long id);

	List<Product> save(Product product);

}
