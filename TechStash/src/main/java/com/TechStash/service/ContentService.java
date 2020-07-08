package com.TechStash.service;

import java.util.List;

import com.TechStash.entity.Carousel;
import com.TechStash.entity.Conference;
import com.TechStash.entity.Conference_setting;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Header_section;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Jobs;

public interface ContentService {
	
	// Conference Content
	public void saveConference(Conference conference);
	public List<Conference> conferenceContent();
	public List<Conference> conferenceTable();
	public void deleteConference(int id);
	public Conference conferenceEditResult(int id);
	public void conferenceContentUpdate(int id,String title, byte[] image, String description, String location, String link, String date);
	public List<Conference> getConfereceImage(int id);
	public void conferenceStatusUpdate(int id,String status);
	
	// Conference Carousel Content
	public List<Carousel> getCarousel();
	public void deleteCarousel(int id);
	public List<Carousel> getCarouselImage(int id);
	public void carouselUpdate(int id,byte[] image);
	public void carouseleStatusUpdate(int id,String status);
	public void newcarousel(byte[] image);
	public List<Carousel> carouselResultWebsite();
	public List<Carousel> carouselResultMinId();
	
	// Header Section
	public Header_section headerContentAdmin(int id);
	public List<Header_section> headerContentAdminList(int id);
	public void headerSectionUpdate(int id,byte[] headerImage, String title, String subtitle,byte[] backgroundImage);
	public List<Header_section> getSectionHeaderImage(int id);
	public List<Header_section> getSectionBackgroundImage(int id);
	
	// jobs
	public List<Jobs> jobContent();
	public void saveJob(Jobs jobs);
	public void jobContentUpdate(int id,String companyname,String title, byte[] image, String address, String salary, String type, String link);
	public void deleteJob(int id);
	public void jobStatusUpdate(int id,String status);
	public Jobs jobEditResult(int id);
	public List<Jobs> getJobImage(int id);
	public List<Jobs> jobsWebsiteContent();
	
}
