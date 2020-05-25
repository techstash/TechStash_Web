package com.TechStash.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechStash.dao.DashboardUsersDAO;
import com.TechStash.entity.Dashboard_users;

@Service
public class DashboardUserServiceImpl implements DashboardUserService {

	@Autowired
	private DashboardUsersDAO dashboardUsersDAO;
	
	@Transactional
	public void saveUsers(Dashboard_users dashboardUsers) {
		
		dashboardUsersDAO.saveUsers(dashboardUsers);

	}

	@Transactional
	public List<Dashboard_users> getEmail(String email) {
		
		return dashboardUsersDAO.getEmail(email);
	}
	
	@Transactional
	public List<Dashboard_users> validateUser(String email, String password) {
		
		return dashboardUsersDAO.validateUser(email, password);
	}

	@Transactional
	public void approveProfile(String email, String status) {

		dashboardUsersDAO.approveProfile(email, status);
	}

	@Transactional
	public Dashboard_users getUserDetail(int id) {
		
		return dashboardUsersDAO.getUserDetail(id);
	}

	@Override
	public void profileUpdate(int id, String name, String password, String phone, String location, byte[] image,
			String bio, String designation, String linkedin, String github, String twitter, String facebook) {
		
		dashboardUsersDAO.profileUpdate(id, name, password, phone, location, image, bio, designation, linkedin, github, twitter, facebook);
	}

	@Transactional
	public void declineProfile(String email) {
		dashboardUsersDAO.declineProfile(email);
	}

}
