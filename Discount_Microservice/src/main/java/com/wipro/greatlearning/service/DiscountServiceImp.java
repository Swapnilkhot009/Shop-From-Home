package com.wipro.greatlearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.greatlearning.entity.Discount;
import com.wipro.greatlearning.repository.DiscountRepository;

@Service
public class DiscountServiceImp implements IDiscountService {
	
	@Autowired
	private DiscountRepository repo;

	@Override
	public Discount addDiscount(Discount disc) {
		// TODO Auto-generated method stub
		return repo.save(disc);
	}

	@Override
	public List<Discount> getAllDiscounts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Discount getDiscountById(long id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

	@Override
	public void deleteDiscountBuId(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

}
