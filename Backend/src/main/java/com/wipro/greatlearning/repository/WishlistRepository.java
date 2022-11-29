package com.wipro.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.greatlearning.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

}
