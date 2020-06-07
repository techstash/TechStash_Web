package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.PodcastSection;

@Repository
public class PodcastSectionDAOImpl implements PodcastSectionDAO {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public List<PodcastSection> getImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from PodcastSection where id=:id");
		theQuery.setParameter("id", id);
		List<PodcastSection> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public List<PodcastSection> getResultWebsite() {
		byte[] image=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from PodcastSection where id=1",PodcastSection.class);
		List<PodcastSection> result = theQuery.getResultList();
		
		for(PodcastSection dbresult : result) {
			image=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(image)));
			
        }
		currentSession.close();
		return result;
	}

	@Override
	public PodcastSection getResultAdmin() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		PodcastSection dbresult=currentSession.get(PodcastSection.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public void podcastSectionUpdate(byte[] image, String title, String subtitle, String buttontext, boolean status) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE podcastsection set image=:image,title=:title,subtitle=:subtitle,buttontext=:buttontext,status=:status where id=1");
		theQuery.setParameter("image", image);
		theQuery.setParameter("title", title);
		theQuery.setParameter("subtitle", subtitle);
		theQuery.setParameter("buttontext", buttontext);
		theQuery.setParameter("status", status);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();	
		
	}

}
