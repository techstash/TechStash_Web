package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.Banner;
import com.TechStash.entity.ConferenceSection;

@Repository
public class ConferenceSectionDAOImpl implements ConferenceSectionDAO {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public List<ConferenceSection> getImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from ConferenceSection where id=:id");
		theQuery.setParameter("id", id);
		List<ConferenceSection> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public List<ConferenceSection> getResultWebsite() {
		byte[] image=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from ConferenceSection where id=1",ConferenceSection.class);
		List<ConferenceSection> result = theQuery.getResultList();
		
		for(ConferenceSection dbresult : result) {
			image=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(image)));
			
        }
		currentSession.close();
		return result;
	}

	@Override
	public ConferenceSection getResultAdmin() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		ConferenceSection dbresult=currentSession.get(ConferenceSection.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public void conferenceSectionupdate(byte[] image, String title, String subtitle, String buttontextleft,
			String buttontextright, boolean status) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE conferencesection set image=:image,title=:title,subtitle=:subtitle,buttontextleft=:buttontextleft,buttontextright=:buttontextright,status=:status where id=1");
		theQuery.setParameter("image", image);
		theQuery.setParameter("title", title);
		theQuery.setParameter("subtitle", subtitle);
		theQuery.setParameter("buttontextleft", buttontextleft);
		theQuery.setParameter("buttontextright", buttontextright);
		theQuery.setParameter("status", status);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();		
	}
}
