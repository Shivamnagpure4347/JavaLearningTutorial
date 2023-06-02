package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Admin;
import com.service.AdminServiceImpli;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {

	@Autowired
	AdminServiceImpli adminserviceIm;

	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return adminserviceIm.addAdmin(admin);

	}

	@DeleteMapping("/deleteadmin/{adminId}")
	public String findAdminByAdminId(@PathVariable int adminId) {
		return adminserviceIm.deleteAdmin(adminId);

	}

	@PutMapping("/adminUpdate")
	public Admin updateAdmin(@RequestBody Admin admin) {
		return adminserviceIm.updateAdmin(admin);

	}

	@GetMapping("/findalladmin")
	public List<Admin> findAllAdmin() {
		return adminserviceIm.getAllAdmin();
	}

	@GetMapping("/getName/adminname")
	public List<Admin> findAdminNameList() {
		return (List<Admin>) adminserviceIm.getAllAdmin();
	}

}
