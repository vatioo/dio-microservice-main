package com.digitalinnovationone.productcatalog.repository;

import com.digitalinnovationone.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {



}
