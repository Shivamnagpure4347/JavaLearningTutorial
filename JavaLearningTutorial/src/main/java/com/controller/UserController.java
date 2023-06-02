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


import com.model.User;
import com.service.AdminServiceImpli;
import com.service.UserServiceImp;


@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserController 
{
	
	@Autowired
	UserServiceImp userserviceimple;
	
	 @PostMapping("a/addUser")
		public User addUser(@RequestBody User user)
		{
			return userserviceimple.addUser(user);
			
		}
	 
	 @GetMapping("e/find/{email}")
	 public User findByEmail(@PathVariable String email) {
		 return userserviceimple.getUserByEmail(email);
	 }
		
	 
		@GetMapping("/user/{id}")
		public User findUsertById(@PathVariable int id) {
			
			return userserviceimple.findById(id);
		}
		
		@PostMapping("/addUsers")
		public List<User> addProducts(@RequestBody List<User> user){
			return userserviceimple.saveProducts(user);
		}

		
		@DeleteMapping("/delete/{id}")
		public String deleteProduct(@PathVariable int id) {
			return userserviceimple.deleteUser(id);
		}
		
		@PutMapping("/update")
		public User updateProduct(@RequestBody User user) {
			return userserviceimple.updateUser(user);
		}
	
}