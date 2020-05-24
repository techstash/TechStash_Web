package com.TechStash.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.entity.Dashboard_users;

@Repository
public class DashboardUsersDAOImpl implements DashboardUsersDAO {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public void saveUsers(Dashboard_users dashboardUsers) {

		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		System.out.println("agdsgd");
		Date date = new Date();  
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		String strDate= formatter.format(date);  
		
		dashboardUsers.setDate(strDate);
		
		dashboardUsers.setStatus("false");
		System.out.println("agdsgd");
		currentSession.saveOrUpdate(dashboardUsers);
		currentSession.close();
		
	}

	@Override
	public List<Dashboard_users> getEmail(String email) {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Dashboard_users where email=:email");
		theQuery.setParameter("email", email);
		List<Dashboard_users> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}
	
	@Override
	public List<Dashboard_users> validateUser(String email, String password) {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();

		Query theQuery = currentSession.createQuery("from Dashboard_users where email=:email and password=:password");
		theQuery.setParameter("email", email);
		theQuery.setParameter("password", password);
		List<Dashboard_users> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void approveProfile(String email, String status) {

		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE dashboard_users set status=:status where email=:email");
		theQuery.setParameter("email", email);
		theQuery.setParameter("status", status);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	}

	@Override
	public Dashboard_users getUserDetail(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		
		Dashboard_users dbresult=currentSession.get(Dashboard_users.class,id);
		currentSession.close();
		
		return dbresult;
	}

	@Override
	public void profileUpdate(int id, String name, String password, String phone, String location, byte[] image,
			String bio, String designation, String linkedin, String github, String twitter, String facebook) {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE dashboard_users set name=:name,password=:password,phone=:phone,location=:location,image=:image,bio=:bio,designation=:designation,linkedin=:linkedin,github=:github, twitter=:twitter, facebook=:facebook where id=:id");
		theQuery.setParameter("name", name);
		theQuery.setParameter("password", password);
		theQuery.setParameter("phone", phone);
		theQuery.setParameter("location", location);
		theQuery.setParameter("image", image);
		theQuery.setParameter("bio", bio);
		theQuery.setParameter("designation", designation);
		theQuery.setParameter("linkedin", linkedin);
		theQuery.setParameter("github", github);
		theQuery.setParameter("twitter", twitter);
		theQuery.setParameter("facebook", facebook);
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	}

}
