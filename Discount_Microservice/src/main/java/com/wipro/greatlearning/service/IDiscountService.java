package com.wipro.greatlearning.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.greatlearning.entity.Discount;

@Service
public interface IDiscountService {
	
	public Discount addDiscount(Discount disc);
	
	public List<Discount> getAllDiscounts();
	
	public Discount getDiscountById(long id);
	
	public void deleteDiscountBuId(long id);
	
	

}
