package com.example.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.productcatalog.model.Attributes;

@Repository
public interface AttributeRepository extends CrudRepository<Attributes, Long>{

}
