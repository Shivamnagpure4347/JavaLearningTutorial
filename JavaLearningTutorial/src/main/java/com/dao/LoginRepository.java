package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Login;

public interface LoginRepository extends JpaRepository<Login,String>
{

	void deleteByEmail(String email);

	Login findByEmail(String email);
	
	

	
}
