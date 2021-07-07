package com.example.productcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.productcatalog.model.Product;
import com.example.productcatalog.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value="/get")
	public Product get(@RequestParam("id") long id) {
		return productService.getProduct(id);
	} 
	
	@PostMapping(value="/add")
	public List<Product> add(@RequestBody final Product product){
		return productService.save(product);
	}
}
