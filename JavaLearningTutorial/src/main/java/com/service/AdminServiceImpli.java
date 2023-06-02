package com.service;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepository;
import com.model.Admin;


@Service
public class AdminServiceImpli implements AdminService
{
	
	
	@Autowired
	AdminRepository  adminRepository;

	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public String deleteAdmin(int id) {
		adminRepository.deleteById(id);
		return "Admin remove !"+id;
	}


	
	 @SuppressWarnings("deprecation")
	@Override public Admin findById(int id) {

	 return adminRepository.getById(id); 
	 }
	

	

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		Admin existingAdmin= adminRepository.findById(admin.getAdminId()).orElse(null);
		existingAdmin.setAdminname(admin.getAdminname());
		 return null;
	}

	
	
}
