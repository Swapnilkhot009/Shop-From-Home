package com.wipro.greatlearning.service;

import java.util.List;

import com.wipro.greatlearning.dto.UserDTO;
import com.wipro.greatlearning.entity.User;



public interface IUserService {
	
	public String addUser(UserDTO userDto);
	
	public List<User> getAllUser();
	
	public String updateUser(UserDTO userDto);
	
	public User getUserById(long id);
	
	public String deleteUser(long id);

}
