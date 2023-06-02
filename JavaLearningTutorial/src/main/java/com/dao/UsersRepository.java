package com.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.model.User;

public interface UsersRepository extends JpaRepository<User,Integer>
{



	public User findByEmail(String email);

	public User findById(int id);


	
}