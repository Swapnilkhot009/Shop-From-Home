package com.wipro.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.greatlearning.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
