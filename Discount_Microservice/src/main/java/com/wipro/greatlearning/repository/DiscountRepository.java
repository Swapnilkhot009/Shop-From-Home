package com.wipro.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.greatlearning.entity.Discount;

public interface DiscountRepository extends JpaRepository<Discount, Long> {

}
