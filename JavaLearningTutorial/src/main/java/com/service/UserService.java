package com.service;








import java.util.List;

import com.model.User;

public interface UserService {

	
	//Add
	User addUser(User user);
	
	
	//delete by id
	
	String deleteUser(int id);
	
	
	User getUserByEmail(String email);

	
	User findById(int id);
	
	List<User> saveProducts(List<User> user);
	
	
	List<User> getAllUsers();
		
	User updateUser(User user);
	
	
	
}