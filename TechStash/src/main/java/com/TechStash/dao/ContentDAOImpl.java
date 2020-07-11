package com.TechStash.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.Blogs;
import com.TechStash.entity.Carousel;
import com.TechStash.entity.Communities;
import com.TechStash.entity.Conference;
import com.TechStash.entity.Header_section;
import com.TechStash.entity.Jobs;
import com.TechStash.entity.Resources;

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
		byte[] image=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Conference order by date",Conference.class);
		List<Conference> result = theQuery.getResultList();
		
		for(Conference dbresult : result) {
			image=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(image)));
			
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
		Query theQuery = currentSession.createQuery("from Conference where status=1 order by date desc",Conference.class);
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
		
		byte[] profileImage=null;
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Carousel",Carousel.class);
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

	@Override
	public Header_section headerContentAdmin(int id) {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Header_section result=currentSession.get(Header_section.class,id);
		currentSession.close();
		return result;
	}

	@Override
	public List<Header_section> headerContentAdminList(int id) {
		byte[] headerImage=null;
		byte[] backgroundImage=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Header_section where id=:id");
		theQuery.setParameter("id", id);
		List<Header_section> result = theQuery.getResultList();
		
		for(Header_section dbresult : result) {
			headerImage=dbresult.getHeaderimage();
			byte[] encode1 = java.util.Base64.getEncoder().encode(headerImage);
			dbresult.setEncodedHeaderimage(new String(java.util.Base64.getEncoder().encode(headerImage)));
				
			backgroundImage=dbresult.getBackgroundimage();
			byte[] encode2 = java.util.Base64.getEncoder().encode(backgroundImage);
			dbresult.setEncodedBackgroundimage(new String(java.util.Base64.getEncoder().encode(backgroundImage)));
        }
		currentSession.close();
		return result;
	}

	@Override
	public void headerSectionUpdate(int id, byte[] headerImage, String title, String subtitle, byte[] backgroundImage) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE header_section set headerimage=:headerimage,title=:title,subtitle=:subtitle,backgroundimage=:backgroundimage where id=:id");
		theQuery.setParameter("headerimage", headerImage);
		theQuery.setParameter("title", title);
		theQuery.setParameter("subtitle", subtitle);
		theQuery.setParameter("backgroundimage", backgroundImage);
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();	
	}

	@Override
	public List<Header_section> getSectionHeaderImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Header_section where id=:id");
		theQuery.setParameter("id", id);
		List<Header_section> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public List<Header_section> getSectionBackgroundImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Header_section where id=:id");
		theQuery.setParameter("id", id);
		List<Header_section> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public List<Jobs> jobContent() {

		byte[] image=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Jobs order by id",Jobs.class);
		List<Jobs> result = theQuery.getResultList();
		
		for(Jobs dbresult : result) {
			image=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(image)));
        }
		
		currentSession.close();
		return result;
	
	}

	@Override
	public void saveJob(Jobs jobs) {

		Boolean status=false;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		jobs.setStatus(status);
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("insert into jobs (id,companyname,title,image,address,salary,type,link,status) values (:1,:2,:3,:4,:5,:6,:7,:8,:9)");
		theQuery.setParameter("1", jobs.getId());
		theQuery.setParameter("2", jobs.getCompanyname());
		theQuery.setParameter("3", jobs.getTitle());
		theQuery.setParameter("4", jobs.getImage());
		theQuery.setParameter("5", jobs.getAddress());
		theQuery.setParameter("6", jobs.getSalary());
		theQuery.setParameter("7", jobs.getType());
		theQuery.setParameter("8", jobs.getLink());
		theQuery.setParameter("9", jobs.isStatus());
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public void jobContentUpdate(int id, String companyname, String title, byte[] image, String address, String salary,
			String type, String link) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE jobs set companyname=:1,title=:2,image=:3,address=:4,salary=:5,type=:6,link=:7 where id=:8");
		theQuery.setParameter("1", companyname);
		theQuery.setParameter("2", title);
		theQuery.setParameter("3", image);
		theQuery.setParameter("4", address);
		theQuery.setParameter("5", salary);
		theQuery.setParameter("6", type);
		theQuery.setParameter("7", link);
		theQuery.setParameter("8", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	}

	@Override
	public void deleteJob(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("delete from jobs where id=:id");
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public void jobStatusUpdate(int id, String status) {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE jobs set status=:status where id=:id");
		theQuery.setParameter("status", status);
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public Jobs jobEditResult(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Jobs dbresult=currentSession.get(Jobs.class,id);
		return dbresult;
	}

	@Override
	public List<Jobs> getJobImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Jobs where id=:id");
		theQuery.setParameter("id", id);
		List<Jobs> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public List<Jobs> jobsWebsiteContent() {

		byte[] profileImage=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Jobs where status=1 order by id desc",Jobs.class);
		List<Jobs> result = theQuery.getResultList();
		
		for(Jobs dbresult : result) {
			profileImage=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(profileImage);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(profileImage)));
        }
		currentSession.close();
		return result;
	}

	@Override
	public List<Resources> resourceContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Resources order by id",Resources.class);
		List<Resources> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void saveResource(Resources resources) {
		Boolean status=false;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		resources.setStatus(status);
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("insert into resources (id,name,link,status) values (:1,:2,:3,:4)");
		theQuery.setParameter("1", resources.getId());
		theQuery.setParameter("2", resources.getName());
		theQuery.setParameter("3", resources.getLink());
		theQuery.setParameter("4", resources.isStatus());
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	}

	@Override
	public void deleteResource(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("delete from resources where id=:id");
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	}

	@Override
	public void resourceStatusUpdate(int id, String status) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE resources set status=:status where id=:id");
		theQuery.setParameter("status", status);
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public Resources resourceEditResult(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Resources dbresult=currentSession.get(Resources.class,id);
		return dbresult;
	}

	@Override
	public void resourceContentUpdate(int id, String name, String link) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE resources set name=:1,link=:2 where id=:3");
		theQuery.setParameter("1", name);
		theQuery.setParameter("2", link);
		theQuery.setParameter("3", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public List<Resources> resourcesWebsiteContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Resources where status=1 order by id desc",Resources.class);
		List<Resources> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public List<Communities> communitiesContent() {
		byte[] image=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Communities order by date",Communities.class);
		List<Communities> result = theQuery.getResultList();
		
		for(Communities dbresult : result) {
			image=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(image)));
			
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
	public void saveCommunity(Communities communities) {

		Boolean status=false;
		try {
		
		Date communityDate=new SimpleDateFormat("dd/MM/yyyy").parse(communities.getDate());
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		communities.setStatus(status);
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("insert into communities (id, title,image,date,address,link,status) values (:1,:2,:3,:4,:5,:6,:7)");
		theQuery.setParameter("1", communities.getId());
		theQuery.setParameter("2", communities.getTitle());
		theQuery.setParameter("3", communities.getImage());
		theQuery.setParameter("4", communityDate);
		theQuery.setParameter("5", communities.getAddress());
		theQuery.setParameter("6", communities.getLink());
		theQuery.setParameter("7", communities.isStatus());
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
	
	}

	@Override
	public void deleteCommunity(int id) {

		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("delete from communities where id=:id");
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public List<Communities> getCommunityImage(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Communities where id=:id");
		theQuery.setParameter("id", id);
		List<Communities> result = theQuery.getResultList();
		currentSession.close();
		return result;
	
	}

	@Override
	public void communityStatusUpdate(int id, String status) {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE communities set status=:status where id=:id");
		theQuery.setParameter("status", status);
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	
	}

	@Override
	public Communities communityEditResult(int id) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Communities dbresult=currentSession.get(Communities.class,id);
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
	public void communityContentUpdate(int id, String title, byte[] image, String date, String address, String link) {

		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Date communityDate;
		try {
			communityDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		
		Query theQuery = currentSession.createNativeQuery("UPDATE communities set title=:1,image=:2,date=:3,address=:4,link=:5 where id=:6");
		theQuery.setParameter("1", title);
		theQuery.setParameter("2", image);
		theQuery.setParameter("3", communityDate);
		theQuery.setParameter("4", address);
		theQuery.setParameter("5", link);
		theQuery.setParameter("6", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	@Override
	public List<Communities> communityWebsiteContent() {

		byte[] profileImage=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Communities where status=1 order by date desc",Communities.class);
		List<Communities> result = theQuery.getResultList();
		
		for(Communities dbresult : result) {
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
	public List<Blogs> blogContent() {

		byte[] image=null;
		String cuttedvalue =null;
		int maxLength = 245;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Blogs order by date",Blogs.class);
		List<Blogs> result = theQuery.getResultList();
		
		for(Blogs dbresult : result) {
			image=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(image)));
			
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
			
			if (dbresult.getDescription().length() > maxLength)
			{
				cuttedvalue = dbresult.getDescription().substring(0, maxLength);
				dbresult.setDescription(cuttedvalue);
			}
        }
		
		currentSession.close();
		return result;
	}

	@Override
	public void saveBlog(Blogs blogs) {

		Boolean status=false;
		try {
		
		Date blogdate=new SimpleDateFormat("dd/MM/yyyy").parse(blogs.getDate());
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		blogs.setStatus(status);
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("insert into blogs (id, title,image,author,date,category,description,link,status) values (:1,:2,:3,:4,:5,:6,:7,:8,:9)");
		theQuery.setParameter("1", blogs.getId());
		theQuery.setParameter("2", blogs.getTitle());
		theQuery.setParameter("3", blogs.getImage());
		theQuery.setParameter("4", blogs.getAuthor());
		theQuery.setParameter("5", blogdate);
		theQuery.setParameter("6", blogs.getCategory());
		theQuery.setParameter("7", blogs.getDescription());
		theQuery.setParameter("8", blogs.getLink());
		theQuery.setParameter("9", blogs.isStatus());
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
	}

	@Override
	public void deleteBlog(int id) {
		
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("delete from blogs where id=:id");
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public List<Blogs> getBlogImage(int id) {

		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Blogs where id=:id");
		theQuery.setParameter("id", id);
		List<Blogs> result = theQuery.getResultList();
		currentSession.close();
		return result;
	
	}

	@Override
	public void blogStatusUpdate(int id, String status) {

		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE blogs set status=:status where id=:id");
		theQuery.setParameter("status", status);
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
	
	}

	@Override
	public Blogs blogEditResult(int id) {

		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Blogs dbresult=currentSession.get(Blogs.class,id);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(dbresult.getDate());
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
			String strDate = dateFormat.format(date);  
			dbresult.setDate(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		currentSession.close();
		return dbresult;
	
	}

	@Override
	public void blogContentUpdate(int id, String title, byte[] image, String author, String date, String category,
			String description, String link) {

		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Date blogDate;
	try {
		blogDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		
		Query theQuery = currentSession.createNativeQuery("UPDATE blogs set title=:1,image=:2,author=:3,date=:4,category=:5,description=:6,link=:7 where id=:8");
		theQuery.setParameter("1", title);
		theQuery.setParameter("2", image);
		theQuery.setParameter("3", author);
		theQuery.setParameter("4", blogDate);
		theQuery.setParameter("5", category);
		theQuery.setParameter("6", description);
		theQuery.setParameter("7", link);
		theQuery.setParameter("8", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
	}

	@Override
	public List<Blogs> blogWebsiteContent() {

		byte[] photo=null;
		String cuttedvalue =null;
		int maxLength = 245;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Blogs where status=1 order by date desc",Blogs.class);
		List<Blogs> result = theQuery.getResultList();
		
		for(Blogs dbresult : result) {
			photo=dbresult.getImage();
			byte[] encode = java.util.Base64.getEncoder().encode(photo);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(photo)));
			
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date date = format.parse(dbresult.getDate());
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
				String strDate = dateFormat.format(date);  
				dbresult.setDate(strDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			if (dbresult.getDescription().length() > maxLength)
			{
				cuttedvalue = dbresult.getDescription().substring(0, maxLength);
				dbresult.setDescription(cuttedvalue);
			}
				
        }
		currentSession.close();
		return result;
	
	}

	@Override
	public List<Blogs> blogDetailResult(String link) {

		byte[] photo=null;
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery=currentSession.createQuery("from Blogs where link=:link");
		theQuery.setParameter("link", link);
		List<Blogs> result = theQuery.getResultList();
		
		for(Blogs dbresult : result) {
			photo=dbresult.getImage();
			byte[] encode1 = java.util.Base64.getEncoder().encode(photo);
			dbresult.setEncodedImage(new String(java.util.Base64.getEncoder().encode(photo)));
        }
		currentSession.close();
		return result;
	
	}

}
