package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.JobSection;

@Repository
public class JobSectionDAOImpl implements JobSectionDAO {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public List<JobSection> getImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from JobSection where id=:id");
		theQuery.setParameter("id", id);
		List<JobSection> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public List<JobSection> getResultWebsite() {
		byte[] image=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from JobSection where id=1",JobSection.class);
		List<JobSection> result = theQuery.getResultList();
		
		for(JobSection dbresult : result) {
			image=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(image)));
			
        }
		currentSession.close();
		return result;
	}

	@Override
	public JobSection getResultAdmin() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		JobSection dbresult=currentSession.get(JobSection.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public void jobSectionUpdate(byte[] image, String title, String subtitle, String buttontextleft,
			String buttontextright, boolean status) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE jobsection set image=:image,title=:title,subtitle=:subtitle,buttontextleft=:buttontextleft,buttontextright=:buttontextright,status=:status where id=1");
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
