package com.service;

import com.model.Admin;
import com.model.Login;

public interface LoginService {
	
	Login addLogin(Login admin);
	
	String deleteLogin(String email);

	Login updateLogin(Login admin);
	
	Login getLoginByEmail(String email);
	
	
	}