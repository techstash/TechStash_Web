package com.TechStash.service;

import java.util.List;

import com.TechStash.entity.Blogs;
import com.TechStash.entity.Carousel;
import com.TechStash.entity.Communities;
import com.TechStash.entity.Conference;
import com.TechStash.entity.Conference_setting;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Header_section;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Jobs;
import com.TechStash.entity.Resources;
import com.TechStash.entity.Speakers;

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
	
	// Jobs
	public List<Jobs> jobContent();
	public void saveJob(Jobs jobs);
	public void jobContentUpdate(int id,String companyname,String title, byte[] image, String address, String salary, String type, String link);
	public void deleteJob(int id);
	public void jobStatusUpdate(int id,String status);
	public Jobs jobEditResult(int id);
	public List<Jobs> getJobImage(int id);
	public List<Jobs> jobsWebsiteContent();
	
	// Resources
	public List<Resources> resourceContent();
	public void saveResource(Resources resources);
	public void deleteResource(int id);
	public void resourceStatusUpdate(int id,String status);
	public Resources resourceEditResult(int id);
	public void resourceContentUpdate(int id,String name,String link);
	public List<Resources> resourcesWebsiteContent();
	
	// Communities
	public List<Communities> communityContent();
	public void saveCommunity(Communities communities);
	public void deleteCommunity(int id);
	public List<Communities> getCommunityImage(int id);
	public void communityStatusUpdate(int id,String status);
	public Communities communityEditResult(int id);
	public void communityContentUpdate(int id,String title, byte[] image, String date, String address, String link);
	public List<Communities> communityWebsiteContent();
	
	// Blogs
	public List<Blogs> blogContent();
	public void saveBlog(Blogs blogs);
	public void deleteBlog(int id);
	public List<Blogs> getBlogImage(int id);
	public void blogStatusUpdate(int id,String status);
	public Blogs blogEditResult(int id);
	public void blogContentUpdate(int id,String title, byte[] image, String author, String date, String category, String description, String link);
	public List<Blogs> blogWebsiteContent();
	public List<Blogs> blogDetailResult(String link);
	
	// Speakers
	public List<Speakers> speakerContent();
	public void saveSpeaker(Speakers speakers);
	public void deleteSpeaker(int id);
	public List<Speakers> getSpeakerImage(int id);
	public void speakerStatusUpdate(int id,String status);
	public Speakers speakerEditResult(int id);
	public void speakerContentUpdate(int id,String name, byte[] image, String location, String category, String bio, String facebook, String twitter, String github, String latitude, String longitude, String link);
	public List<Speakers> speakerWebsiteContent();
	public List<Speakers> speakerDetailResult(String link);
	
}
