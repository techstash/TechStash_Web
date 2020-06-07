package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.SpeakerSection;

@Repository
public class SpeakerSectionDAOImpl implements SpeakerSectionDAO {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public List<SpeakerSection> getResultWebsite() {
		byte[] image=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from SpeakerSection where id=1",SpeakerSection.class);
		List<SpeakerSection> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public SpeakerSection getResultAdmin() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		SpeakerSection dbresult=currentSession.get(SpeakerSection.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public void speakerSectionUpdate(String title, String buttontext, boolean status) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE speakersection set title=:title,buttontext=:buttontext,status=:status where id=1");
		theQuery.setParameter("title", title);
		theQuery.setParameter("buttontext", buttontext);
		theQuery.setParameter("status", status);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();	
	}
	
}
