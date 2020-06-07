package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.Banner;
import com.TechStash.entity.Dashboard_users;
import com.TechStash.entity.Footer;

@Repository
public class BannerDAOImpl implements BannerDAO {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public Banner getContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Banner dbresult=currentSession.get(Banner.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Banner> getImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Banner where id=:id");
		theQuery.setParameter("id", id);
		List<Banner> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void bannerUpdate(byte[] image, String title, String subtitle, boolean status) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE banner set image=:image,title=:title,subtitle=:subtitle,status=:status where id=1");
		theQuery.setParameter("image", image);
		theQuery.setParameter("title", title);
		theQuery.setParameter("subtitle", subtitle);
		theQuery.setParameter("status", status);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	}

	@Override
	public List<Banner> getDetail() {
		byte[] image=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Banner where id=1",Banner.class);
		List<Banner> result = theQuery.getResultList();
		
		for(Banner dbresult : result) {
			image=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(image)));
			
        }
		currentSession.close();
		return result;
	}

}
