package com.service;




import java.util.List;

import com.model.Admin;


public interface AdminService {

	
	//Add
		Admin addAdmin(Admin admin);
		
		
		//delete by id
		
		String deleteAdmin(int id);
		
		Admin findById(int id);
		
		List<Admin> getAllAdmin();
			
		Admin updateAdmin(Admin admin);
		
		
}
