
package com.wipro.greatlearning.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.greatlearning.dto.AdminDTO;
import com.wipro.greatlearning.entity.Admin;
import com.wipro.greatlearning.repository.AdminRepository;
import com.wipro.greatlearning.service.IAdminService;


@Service
public class AdminServiceImp implements IAdminService {
	
	
	@Autowired
	private AdminRepository repo;



	@Override
	public String addAdmin(AdminDTO adminDto) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setEmail(adminDto.getEmail());
		admin.setPassword(adminDto.getPassword());
			repo.save(admin);
			return "New Admin data saved";
		
	}
	


	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

}
