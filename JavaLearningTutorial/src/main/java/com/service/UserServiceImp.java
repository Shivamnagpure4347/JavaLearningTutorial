package com.service;






import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UsersRepository;
import com.model.User;


@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UsersRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User findById(int id) {
		return userRepository.findById(id);
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
	   userRepository.deleteById(id);
	   return "user remove !"+id;
	}
	@Override
	public List<User> saveProducts(List<User> user) {
		return userRepository.saveAll(user);
	}
	
	

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}


	@Override
	public User updateUser(User user) {
		User existingUser = userRepository.findById(user.getId());
		existingUser.setFirstname(user.getFirstname());
		
		return null;
	}

	
	
	
	}
