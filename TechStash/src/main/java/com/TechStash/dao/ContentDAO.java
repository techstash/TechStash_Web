package com.TechStash.dao;

import java.util.List;

import com.TechStash.entity.Carousel;
import com.TechStash.entity.Conference;
import com.TechStash.entity.Header_section;

public interface ContentDAO {
	
	public void saveConference(Conference conference);
	public List<Conference> conferenceContent();
	public void deleteConference(int id);
	public Conference conferenceEditResult(int id);
	public void conferenceContentUpdate(int id,String title, byte[] image, String description, String location, String link, String date);
	public List<Conference> getConfereceImage(int id);
	public List<Conference> conferenceTable();
	public void conferenceStatusUpdate(int id,String status);
	
	public List<Carousel> getCarousel();
	public void deleteCarousel(int id);
	public List<Carousel> getCarouselImage(int id);
	public void carouselUpdate(int id,byte[] image);
	public void carouseleStatusUpdate(int id,String status);
	public void newcarousel(byte[] image);
	public List<Carousel> carouselResultWebsite();
	public List<Carousel> carouselResultMinId();
	
	public Header_section headerContentAdmin(int id);
	public List<Header_section> headerContentAdminList(int id);
	public void headerSectionUpdate(int id, byte[] headerImage, String title, String subtitle,byte[] backgroundImage);
	public List<Header_section> getSectionHeaderImage(int id);
	public List<Header_section> getSectionBackgroundImage(int id);
}
