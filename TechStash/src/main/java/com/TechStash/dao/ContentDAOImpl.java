package com.TechStash.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.Carousel;
import com.TechStash.entity.Conference;
import com.TechStash.entity.Conference_setting;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Keys_details;

@Repository
public class ContentDAOImpl implements ContentDAO {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public void saveConference(Conference conference) {
		
		Boolean status=false;
		try {
		
		Date conferenceDate=new SimpleDateFormat("dd/MM/yyyy").parse(conference.getDate());
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		conference.setStatus(status);
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("insert into conference (id, title,image,description,location,link,date,status) values (:1,:2,:3,:4,:5,:6,:7,:8)");
		theQuery.setParameter("1", conference.getId());
		theQuery.setParameter("2", conference.getTitle());
		theQuery.setParameter("3", conference.getImage());
		theQuery.setParameter("4", conference.getDescription());
		theQuery.setParameter("5", conference.getLocation());
		theQuery.setParameter("6", conference.getLink());
		theQuery.setParameter("7", conferenceDate);
		theQuery.setParameter("8", conference.getStatus());
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
	}

	@Override
	public List<Conference> conferenceContent() {
		byte[] profileImage=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Conference order by date",Conference.class);
		List<Conference> result = theQuery.getResultList();
		
		for(Conference dbresult : result) {
			profileImage=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(profileImage);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(profileImage)));
			
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date date = format.parse(dbresult.getDate());
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
				String strDate = dateFormat.format(date);  
				dbresult.setDate(strDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		
		currentSession.close();
		return result;
	}

	@Override
	public void deleteConference(int id) {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("delete from conference where id=:id");
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public Conference conferenceEditResult(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Conference dbresult=currentSession.get(Conference.class,id);
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(dbresult.getDate());
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
			String strDate = dateFormat.format(date);  
			dbresult.setDate(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		currentSession.close();
		return dbresult;
	}
	

	@Override
	public void conferenceContentUpdate(int id, String title, byte[] image, String description, String location,
			String link, String date) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		System.out.println(image);
		Date conferenceDate;
		try {
			conferenceDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		
		Query theQuery = currentSession.createNativeQuery("UPDATE conference set title=:1,image=:2,description=:3,location=:4,link=:5,date=:6 where id=:7");
		theQuery.setParameter("1", title);
		theQuery.setParameter("2", image);
		theQuery.setParameter("3", description);
		theQuery.setParameter("4", location);
		theQuery.setParameter("5", link);
		theQuery.setParameter("6", conferenceDate);
		theQuery.setParameter("7", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Conference> getConfereceImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Conference where id=:id");
		theQuery.setParameter("id", id);
		List<Conference> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}
	
	
	@Override
	public List<Conference> conferenceTable() {
		byte[] profileImage=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Conference where status=1 order by date",Conference.class);
		List<Conference> result = theQuery.getResultList();
		
		for(Conference dbresult : result) {
			profileImage=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(profileImage);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(profileImage)));
			
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date date = format.parse(dbresult.getDate());
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
				String strDate = dateFormat.format(date);  
				dbresult.setDate(strDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
        }
		
		currentSession.close();
		return result;
	}
	
	@Override
	public void conferenceStatusUpdate(int id, String status) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE conference set status=:status where id=:id");
		theQuery.setParameter("status", status);
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}
	
	@Override
	public List<Carousel> getCarousel() {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Carousel",Carousel.class);
		List<Carousel> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void deleteCarousel(int id) {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("delete from carousel where id=:id");
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public List<Carousel> getCarouselImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Carousel where id=:id");
		theQuery.setParameter("id", id);
		List<Carousel> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void carouselUpdate(int id, byte[] image) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE carousel set image=:1 where id=:2");
		theQuery.setParameter("1", image);
		theQuery.setParameter("2", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	}

	@Override
	public void carouseleStatusUpdate(int id, String status) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE carousel set status=:status where id=:id");
		theQuery.setParameter("status", status);
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	}

	@Override
	public void newcarousel(byte[] image) {
		
		Boolean status=false;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("insert into carousel (image, status) values (:1,:2)");
		theQuery.setParameter("1", image);
		theQuery.setParameter("2", status);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	}

	@Override
	public List<Carousel> carouselResultWebsite() {
		byte[] profileImage=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Carousel where status=1 order by id");
		List<Carousel> result = theQuery.getResultList();
		
		for(Carousel dbresult : result) {
			profileImage=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(profileImage);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(profileImage)));
        }
		
		currentSession.close();
		return result;
	}

	@Override
	public List<Carousel> carouselResultMinId() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Carousel WHERE id = ( SELECT MIN(id) from Carousel )");
		List<Carousel> result = theQuery.getResultList();
		
		currentSession.close();
		return result;
	}

}
