package com.TechStash.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TechStash.entity.Aboutus_setting;
import com.TechStash.entity.Blog_setting;
import com.TechStash.entity.Community_setting;
import com.TechStash.entity.Conference_setting;
import com.TechStash.entity.Contactus_setting;
import com.TechStash.entity.Faq_setting;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Job_setting;
import com.TechStash.entity.Podcast_setting;
import com.TechStash.entity.Privacypolicy_setting;
import com.TechStash.entity.Resource_setting;
import com.TechStash.entity.Speaker_setting;
import com.TechStash.entity.Subscribe_setting;
import com.TechStash.entity.Volunteer_setting;

@Repository
public class SettingDAOImpl implements SettingDAO {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public Conference_setting conferenceContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Conference_setting dbresult=currentSession.get(Conference_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Conference_setting> conferenceResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Conference_setting where id=1",Conference_setting.class);
		List<Conference_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void conferenceSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE conference_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();	
	}

	@Override
	public Job_setting jobContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Job_setting dbresult=currentSession.get(Job_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Job_setting> jobResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Job_setting where id=1",Conference_setting.class);
		List<Job_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void jobSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE job_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();	
	}

	@Override
	public Speaker_setting speakerContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Speaker_setting dbresult=currentSession.get(Speaker_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Speaker_setting> speakerResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Speaker_setting where id=1",Conference_setting.class);
		List<Speaker_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void speakerSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE speaker_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();	
		
	}

	@Override
	public Blog_setting blogContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Blog_setting dbresult=currentSession.get(Blog_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Blog_setting> blogResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Blog_setting where id=1",Conference_setting.class);
		List<Blog_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void blogSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE blog_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();	
		
	}

	@Override
	public Podcast_setting podcastContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Podcast_setting dbresult=currentSession.get(Podcast_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Podcast_setting> podcastResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Podcast_setting where id=1",Conference_setting.class);
		List<Podcast_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void podcastSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE podcast_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();	
	}

	@Override
	public Community_setting communityContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Community_setting dbresult=currentSession.get(Community_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Community_setting> communityResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Community_setting where id=1",Conference_setting.class);
		List<Community_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void communitySettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE community_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public Resource_setting resourceContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Resource_setting dbresult=currentSession.get(Resource_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Resource_setting> resourceResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Resource_setting where id=1",Conference_setting.class);
		List<Resource_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void resourceSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE resource_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public Volunteer_setting volunteerContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Volunteer_setting dbresult=currentSession.get(Volunteer_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Volunteer_setting> volunteerResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Volunteer_setting where id=1",Conference_setting.class);
		List<Volunteer_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void volunteerSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE volunteer_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public Subscribe_setting subscribeContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Subscribe_setting dbresult=currentSession.get(Subscribe_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Subscribe_setting> subscriberResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Subscribe_setting where id=1",Conference_setting.class);
		List<Subscribe_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void subscribeSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE subscribe_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public Contactus_setting contactusContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Contactus_setting dbresult=currentSession.get(Contactus_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Contactus_setting> cotactusResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Contactus_setting where id=1",Conference_setting.class);
		List<Contactus_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void contactusSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE contactus_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public Aboutus_setting aboutusContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Aboutus_setting dbresult=currentSession.get(Aboutus_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Aboutus_setting> aboutusResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Aboutus_setting where id=1",Conference_setting.class);
		List<Aboutus_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void aboutusSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE aboutus_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public Privacypolicy_setting privacypolicyContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Privacypolicy_setting dbresult=currentSession.get(Privacypolicy_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Privacypolicy_setting> privacypolicyResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Privacypolicy_setting where id=1",Conference_setting.class);
		List<Privacypolicy_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void privacypolicySettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE privacypolicy_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}

	@Override
	public Faq_setting faqContent() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		int id=1;
		Faq_setting dbresult=currentSession.get(Faq_setting.class,id);
		currentSession.close();
		return dbresult;
	}

	@Override
	public List<Faq_setting> faqResultWebsite() {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query theQuery = currentSession.createQuery("from Faq_setting where id=1",Conference_setting.class);
		List<Faq_setting> result = theQuery.getResultList();
		currentSession.close();
		return result;
	}

	@Override
	public void faqSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createNativeQuery("UPDATE faq_setting set metatitle=:metatitle,metadescription=:metadescription,browsertitle=:browsertitle where id=1");
		theQuery.setParameter("metatitle", metatitle);
		theQuery.setParameter("metadescription", metadescription);
		theQuery.setParameter("browsertitle", browsertitle);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		currentSession.close();
		
	}
	
}
