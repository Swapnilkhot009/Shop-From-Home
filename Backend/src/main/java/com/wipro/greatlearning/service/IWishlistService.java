package com.wipro.greatlearning.service;

import java.util.List;

import com.wipro.greatlearning.dto.WishlistDTO;
import com.wipro.greatlearning.entity.Wishlist;



public interface IWishlistService {
	
	public Wishlist addToWishList(WishlistDTO dto);
	
	public List<Wishlist> getAllwishlist();
	
	public List<Wishlist> getAllDataWithSameUserId(long uid);
	
	public String deleteByUserIdAndProdId(long uid,long pid);
		
	}


