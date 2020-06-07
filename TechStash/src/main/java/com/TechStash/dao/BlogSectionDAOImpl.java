package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.BlogSection;

@Repository
public class BlogSectionDAOImpl implements BlogSectionDAO {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public List<BlogSection> getImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from BlogSection where id=:id");
		theQuery.setParameter("id", id);
		List<BlogSection> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public List<BlogSection> getResultWebsite() {
		byte[] image=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from BlogSection where id=1",BlogSection.class);
		List<BlogSection> result = theQuery.getResultList();
		
		for(BlogSection dbresult : result) {
			image=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(image)));
			
        }
		currentSession.close();
		return result;
	}

	@Override
	public BlogSection getResultAdmin() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		BlogSection dbresult=currentSession.get(BlogSection.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public void blogSectionUpdate(byte[] image, String title, String subtitle, String buttontextleft,
			String buttontextright, boolean status) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE blogsection set image=:image,title=:title,subtitle=:subtitle,buttontextleft=:buttontextleft,buttontextright=:buttontextright,status=:status where id=1");
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
