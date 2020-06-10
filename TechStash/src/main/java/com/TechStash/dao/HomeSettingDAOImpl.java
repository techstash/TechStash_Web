package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.ConferenceSection;
import com.TechStash.entity.Home_setting;

@Repository
public class HomeSettingDAOImpl implements HomeSettingDAO {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public Home_setting getContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Home_setting dbresult=currentSession.get(Home_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Home_setting> getImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Home_setting where id=:id");
		theQuery.setParameter("id", id);
		List<Home_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public List<Home_setting> getResultWebsite() {
		byte[] image=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Home_setting where id=1",Home_setting.class);
		List<Home_setting> result = theQuery.getResultList();
		
		for(Home_setting dbresult : result) {
			image=dbresult.getFavicon();
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(image)));
			
        }
		
		currentSession.close();
		return result;
	}

	@Override
	public void homeSettingUpdate(String metatitle, String metadescription, String browsertitle, byte[] favicon) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE home_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle,favicon=:favicon where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.setParameter("favicon", favicon);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();	
	}

}
