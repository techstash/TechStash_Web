package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.NewsletterSection;

@Repository
public class NewsletterSectionDAOImpl implements NewsletterSectionDAO {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public List<NewsletterSection> getImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from NewsletterSection where id=:id");
		theQuery.setParameter("id", id);
		List<NewsletterSection> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public List<NewsletterSection> getResultWebsite() {
		byte[] image=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from NewsletterSection where id=1",NewsletterSection.class);
		List<NewsletterSection> result = theQuery.getResultList();
		
		for(NewsletterSection dbresult : result) {
			image=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(image)));
			
        }
		currentSession.close();
		return result;
	}

	@Override
	public NewsletterSection getResultAdmin() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		NewsletterSection dbresult=currentSession.get(NewsletterSection.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public void newsletterSectionUpdate(byte[] image, String title, boolean status) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE newslettersection set image=:image,title=:title,status=:status where id=1");
		theQuery.setParameter("image", image);
		theQuery.setParameter("title", title);
		theQuery.setParameter("status", status);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();	
		
	}
	
	
}
