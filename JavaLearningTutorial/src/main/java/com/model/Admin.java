package com.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Admin
{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminId;
	private String adminname;
	private String adminEmail;
	private int adminPassword;
	private int adminPhone;
	public Admin() {
		super();
	}
	public Admin(int adminId, String adminname, String adminEmail, int adminPassword,
			int adminPhone) {
		super();
		this.adminId = adminId;
		this.adminname = adminname;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
		this.adminPhone = adminPhone;
	}
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public int getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(int adminPassword) {
		this.adminPassword = adminPassword;
	}
	public int getAdminPhone() {
		return adminPhone;
	}
	
	
	public void setAdminPhone(int adminPhone) {
		this.adminPhone = adminPhone;
	}
	
	

}