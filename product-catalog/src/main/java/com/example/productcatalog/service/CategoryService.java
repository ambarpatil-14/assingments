package com.example.productcatalog.service;

import java.util.List;

import com.example.productcatalog.model.Attributes;
import com.example.productcatalog.model.Category;

public interface CategoryService {

	Category getCategory(long id);

	List<Category> saveCategory(Category category);

	List<Attributes> saveAttributes(Attributes attributes);

	List<Attributes> getAttributeByCategoryId(long id);

}
