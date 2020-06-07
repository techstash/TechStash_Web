package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.CommunitySection;

@Repository
public class CommunitySectionDAOImpl implements CommunitySectionDAO {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public List<CommunitySection> getImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from CommunitySection where id=:id");
		theQuery.setParameter("id", id);
		List<CommunitySection> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public List<CommunitySection> getResultWebsite() {
		byte[] image=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from CommunitySection where id=1",CommunitySection.class);
		List<CommunitySection> result = theQuery.getResultList();
		
		for(CommunitySection dbresult : result) {
			image=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(image)));
			
        }
		currentSession.close();
		return result;
	}

	@Override
	public CommunitySection getResultAdmin() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		CommunitySection dbresult=currentSession.get(CommunitySection.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public void communitySectionUpdate(byte[] image, String title, String subtitle, String buttontextleft,
			String buttontextright, boolean status) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE communitysection set image=:image,title=:title,subtitle=:subtitle,buttontextleft=:buttontextleft,buttontextright=:buttontextright,status=:status where id=1");
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
