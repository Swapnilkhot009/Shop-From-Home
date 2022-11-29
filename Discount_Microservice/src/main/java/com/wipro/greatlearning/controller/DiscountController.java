package com.wipro.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.greatlearning.entity.Discount;
import com.wipro.greatlearning.service.IDiscountService;

@RestController
@RequestMapping("/discount")
@CrossOrigin("http://localhost:4200/")
public class DiscountController {
	
	@Autowired
	private IDiscountService service;
	
	@PostMapping("/add")
	public Discount addDiscount(@RequestBody Discount discount) {
		return service.addDiscount(discount);
	}
	
	@GetMapping("/getAll")
	public List<Discount> getAll(){
		return service.getAllDiscounts();
	}
	
	@GetMapping("/get-discount/{id}")
	public Discount getById(@RequestBody long id) {
		return service.getDiscountById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteDiscount(@RequestBody long id) {
		service.deleteDiscountBuId(id);
	}
	
	

}
