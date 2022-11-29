package com.wipro.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.greatlearning.dto.AdminDTO;
import com.wipro.greatlearning.entity.Admin;
import com.wipro.greatlearning.service.IAdminService;


@SuppressWarnings("unused")
@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:4200/")
public class AdminController {
	
	@Autowired
	private IAdminService service;
	
	@PostMapping("/add-admin")
	public String addAdmin(@RequestBody AdminDTO dto) {
		return service.addAdmin(dto);
	}
	
	@GetMapping("/getAll")
	public List<Admin> getAllAdmins(){
		return service.getAllAdmin();
	}
	
	

}
