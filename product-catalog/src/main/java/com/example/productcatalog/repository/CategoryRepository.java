package com.example.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.productcatalog.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
