package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.Dashboard_users;
import com.TechStash.entity.Keys_details;

@Repository
public class KeysDAOImpl implements KeysDAO {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public void keysAdd(String keyName, String KeyValue) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("insert into keys_details (keyname, keyvalue) values (:1, :2)");
		theQuery.setParameter("1", keyName);
		theQuery.setParameter("2", KeyValue);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public List<Keys_details> getKeys() {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Keys_details",Keys_details.class);
		List<Keys_details> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void deleteKey(int id) {

		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("delete from keys_details where id=:id");
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public void updateKey(int id, String keyValue) {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE keys_details set keyvalue=:keyvalue where id=:id");
		theQuery.setParameter("id", id);
		theQuery.setParameter("keyvalue", keyValue);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	}
	
}