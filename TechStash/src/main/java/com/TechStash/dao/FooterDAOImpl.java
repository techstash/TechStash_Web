package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.Dashboard_users;
import com.TechStash.entity.Footer;

@Repository
public class FooterDAOImpl implements FooterDAO {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public Footer getDetails(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		
		Footer dbresult=currentSession.get(Footer.class,id);
		currentSession.close();
		
		return dbresult;
	}

	@Override
	public void footerUpdate(int id, byte[] image, String footer_text, String facebook_url, String twitter_url,
			String youtube_url, String linkedin_url) {

		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE footer set logo_image=:logo_image,footer_text=:footer_text,facebook_url=:facebook_url,twitter_url=:twitter_url,youtube_url=:youtube_url,linkedin_url=:linkedin_url where id=:id");
		theQuery.setParameter("footer_text", footer_text);
		theQuery.setParameter("logo_image", image);
		theQuery.setParameter("facebook_url", facebook_url);
		theQuery.setParameter("twitter_url", twitter_url);
		theQuery.setParameter("youtube_url", youtube_url);
		theQuery.setParameter("linkedin_url", linkedin_url);
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public List<Footer> getLogoImage(int id) {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Footer where id=:id");
		theQuery.setParameter("id", id);
		List<Footer> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}
	
}
