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

import com.example.productcatalog.model.Attributes;
import com.example.productcatalog.model.Category;
import com.example.productcatalog.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	

	@GetMapping(value = "/get")
	public Category get(@RequestParam("id") long id) {
		return categoryService.getCategory(id);
	}

	@PostMapping(value = "/add")
	public List<Category> add(@RequestBody final Category category) {
		return categoryService.saveCategory(category);
	}
	
	@PostMapping(value = "/add")
	public List<Attributes> add(@RequestBody final Attributes attributes) {
		return categoryService.saveAttributes(attributes);
	}
	
	@GetMapping(value="/get/attribute")
	public List<Attributes> getAttributes(@RequestParam("id") long id){
		return categoryService.getAttributeByCategoryId(id);
	}
}
