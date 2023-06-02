package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LoginRepository;
import com.model.Admin;
import com.model.Login;

@Service
public class LoginServiceImp implements LoginService {

	
	@Autowired
	 LoginRepository LoginRepository;
	
	
	
	@Override
	public Login addLogin(Login admin) {
		
		return LoginRepository.save(admin);
	}
	
	
	@Override
	public String deleteLogin(String Email)
	{
		LoginRepository.deleteByEmail(Email);
		return "login remove !"+Email;
	}


	@Override
	public Login updateLogin(Login admin)
	{
	    Login existingLogin=LoginRepository.findById(admin.getEmail()).orElse(null);
	    existingLogin.setEmail(admin.getEmail());
		return null;
	}


	@Override
	public Login getLoginByEmail(String email)
	{
		return LoginRepository.findByEmail(email);
	}

	
	

}
