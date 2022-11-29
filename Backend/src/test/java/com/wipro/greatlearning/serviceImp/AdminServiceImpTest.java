package com.wipro.greatlearning.serviceImp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.wipro.greatlearning.dto.AdminDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AdminServiceImpTest {
	
	@SuppressWarnings("unused")
	@Autowired
	private AdminServiceImp service;

	@Test
	void testAddAdmin() {

		AdminDTO admindto = new AdminDTO(0, "admin@gmail.com", "Admin123");
		 String addedAdmin= service.addAdmin(admindto);
		 assertNotNull(addedAdmin);

	}

	@Test
	void testGetAllAdmin() {
		List list = service.getAllAdmin();
		assertThat(list).size().isGreaterThan(0);
	}

}
