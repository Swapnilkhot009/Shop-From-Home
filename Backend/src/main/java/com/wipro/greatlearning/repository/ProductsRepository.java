package com.wipro.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.greatlearning.entity.Products;



@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

}
