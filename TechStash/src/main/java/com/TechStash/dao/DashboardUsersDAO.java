package com.TechStash.dao;

import java.util.List;

import com.TechStash.entity.Dashboard_users;

public interface DashboardUsersDAO {
	
	public void saveUsers(Dashboard_users dashboardUsers);
	
	public void approveProfile(String email, String status);
	
	public List<Dashboard_users> getEmail(String email);
	
	public List<Dashboard_users> validateUser(String email,String password);
	
	public Dashboard_users getUserDetail(int id);
	
	public void profileUpdate(int id, String name,String password, String phone, String location, byte[] image,String bio, String designation,String linkedin, String github, String twitter, String facebook);
	
}
