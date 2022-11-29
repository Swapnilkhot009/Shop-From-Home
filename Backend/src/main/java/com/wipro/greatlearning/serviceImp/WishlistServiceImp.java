package com.wipro.greatlearning.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.greatlearning.dto.WishlistDTO;
import com.wipro.greatlearning.entity.Wishlist;
import com.wipro.greatlearning.repository.WishlistRepository;
import com.wipro.greatlearning.service.IWishlistService;



@Service
public class WishlistServiceImp implements IWishlistService {
	
	@Autowired
	private WishlistRepository repo;
	



	@Override
	public Wishlist addToWishList(WishlistDTO dto) {
		Wishlist list=new Wishlist();
		list.setPid(dto.getPid());
		list.setUid(dto.getUid());
		
		return repo.save(list);
	}


	@Override
	public List<Wishlist> getAllwishlist() {
		
		return repo.findAll();
	}



	@Override
	public List<Wishlist> getAllDataWithSameUserId(long uid) {
		// TODO Auto-generated method stub
		List<Wishlist> userProductList=new ArrayList<>();
		List<Wishlist> mainList=this.getAllwishlist();
		for(Wishlist a: mainList) {
			if(a.getUid()==uid) {
				userProductList.add(a);
			}
		}
		
		
		return userProductList;
	}


	@SuppressWarnings("deprecation")
	@Override
	public String deleteByUserIdAndProdId(long uid, long pid) {
		List<Wishlist> userProductListToDelete=new ArrayList<>();
		List<Wishlist> mainList=this.getAllwishlist();
		for(Wishlist a: mainList) {
			if(a.getUid()==uid && a.getPid()==pid) {
				userProductListToDelete.add(a);
			}
		}
		repo.deleteInBatch(userProductListToDelete);
		
		
		return "data deleted";
	}
	

}
