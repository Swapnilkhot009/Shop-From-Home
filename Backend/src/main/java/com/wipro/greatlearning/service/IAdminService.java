package com.wipro.greatlearning.service;

import java.util.List;

import com.wipro.greatlearning.dto.AdminDTO;
import com.wipro.greatlearning.entity.Admin;


public interface IAdminService {
	
	public String addAdmin(AdminDTO adminDto);
	
	public List<Admin> getAllAdmin();

}
