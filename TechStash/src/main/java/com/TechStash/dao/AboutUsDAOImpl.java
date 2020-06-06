package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.Aboutus;
import com.TechStash.entity.Dashboard_users;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Keys_details;

@Repository
public class AboutUsDAOImpl implements AboutUsDAO {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public void saveContent(String content) {

		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE aboutus set content=:content where id=:id");
		theQuery.setParameter("content", content);
		theQuery.setParameter("id", 1);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public Aboutus getResult() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Aboutus dbresult=currentSession.get(Aboutus.class,id);
		currentSession.close();
		return dbresult;
	}
	
	@Override
	public List<Aboutus> getContent() {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Aboutus",Aboutus.class);
		List<Aboutus> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

}
