package com.wipro.greatlearning.service;

import java.util.List;

import com.wipro.greatlearning.entity.Cart;



public interface IcartService {
	public Cart addToCart(Cart cart);
	
	public List<Cart> getAllByUserCart(long id);
	
	public void deleteCart(long id);
	
	public void updateCart(Cart cart,long cid);

}
