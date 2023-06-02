package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.LoginServiceImp;
import com.model.Admin;
import com.model.Login;
import com.model.User;

@RequestMapping("/login")
@RestController
public class LoginController {

	@Autowired
	LoginServiceImp LoginServiceImp;

	@PostMapping("/addLogin")
	public Login addLogin(@RequestBody Login admin)
	{
		return LoginServiceImp.addLogin(admin);

	}

	@DeleteMapping("/deleteadmin/{Email}")
	public String findAdminByAdminId(@PathVariable String Email)
	{
		return LoginServiceImp.deleteLogin(Email);

	}

	@PutMapping("/LoginUpdate")
	public Login updateLogin(@RequestBody Login admin)
	{
		return LoginServiceImp.updateLogin(admin);

	}
	
	
	@GetMapping("/Email")
	public Login getByEmail(String email)
	{
		return LoginServiceImp.getLoginByEmail(email);
		
	}
	

}
