package com.example.productcatalog.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productcatalog.model.Attributes;
import com.example.productcatalog.model.Category;
import com.example.productcatalog.repository.AttributeRepository;
import com.example.productcatalog.repository.CategoryRepository;
import com.example.productcatalog.service.CategoryService;


@Service("categoryService")
public class CategoryServiceIMPL implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private AttributeRepository attributeRepository;

	@Override
	public Category getCategory(long id) {		
		return categoryRepository.findById(id).get();
	}

	@Override
	public List<Category> saveCategory(Category category) {
		categoryRepository.save(category);
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public List<Attributes> saveAttributes(Attributes attributes) {
		attributeRepository.save(attributes);
		return (List<Attributes>) attributeRepository.findAll();
	}

	@Override
	public List<Attributes> getAttributeByCategoryId(long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
