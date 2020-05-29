package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.Aboutus;
import com.TechStash.entity.PrivacyPolicy;

@Repository
public class PrivacyPolicyDAOImpl implements PrivacyPolicyDAO {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public void saveContent(String content) {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE privacypolicy set content=:content where id=:id");
		theQuery.setParameter("content", content);
		theQuery.setParameter("id", 1);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	}

	@Override
	public List<PrivacyPolicy> getContent() {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from PrivacyPolicy",PrivacyPolicy.class);
		List<PrivacyPolicy> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

}
