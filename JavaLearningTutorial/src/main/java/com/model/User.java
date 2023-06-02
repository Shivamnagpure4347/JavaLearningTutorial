package com.model;


import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;




@Entity
@Table(name = "users")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String firstname;
	private String lastname;

	private String email;
	private String username;

	private long userAge;
	private long userpassword;
	private String city;
	private String gender;
	private long phone;

	
	// USER MANY ROLES

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
	private Set<UserRole> userRoles = new LinkedHashSet<UserRole>();

	public User()
	{
		super();
	}

	public User(String firstname, String lastname, String email, String username, long userAge, long userpassword,
			String city, String gender, long phone, Set<UserRole> userRoles, User user, Role role) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.userAge = userAge;
		this.userpassword = userpassword;
		this.city = city;
		this.gender = gender;
		this.phone = phone;
		this.userRoles = userRoles;
}

	public User(int id, String firstname, String lastname, String email, String username, long userAge,
			long userpassword, String city, String gender, long phone, Set<UserRole> userRoles, User user, Role role) {
		super();
		this.Id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.userAge = userAge;
		this.userpassword = userpassword;
		this.city = city;
		this.gender = gender;
		this.phone = phone;
		this.userRoles = userRoles;
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getUserAge() {
		return userAge;
	}

	public void setUserAge(long userAge) {
		this.userAge = userAge;
	}

	public long getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(long userpassword) {
		this.userpassword = userpassword;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	