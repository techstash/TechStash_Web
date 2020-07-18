package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.ContentDAO;
import com.TechStash.entity.Blogs;
import com.TechStash.entity.Carousel;
import com.TechStash.entity.Communities;
import com.TechStash.entity.Conference;
import com.TechStash.entity.Contact;
import com.TechStash.entity.Header_section;
import com.TechStash.entity.Jobs;
import com.TechStash.entity.Resources;
import com.TechStash.entity.Speakers;
import com.TechStash.entity.Subscriber;
import com.TechStash.entity.Volunteers;

@Service
public class ContentServiceImpl implements ContentService {
	
	@Autowired
	private ContentDAO contentDAO;

	@Transactional
	public void saveConference(Conference conference) {
		contentDAO.saveConference(conference);
	}

	@Transactional
	public List<Conference> conferenceContent() {
		return contentDAO.conferenceContent();
	}

	@Transactional
	public void deleteConference(int id) {
		contentDAO.deleteConference(id);
	}

	@Transactional
	public List<Carousel> getCarousel() {
		return contentDAO.getCarousel();
	}

	@Transactional
	public Conference conferenceEditResult(int id) {
		return contentDAO.conferenceEditResult(id);
	}

	@Transactional
	public void conferenceContentUpdate(int id, String title, byte[] image, String description, String location,
			String link, String date) {
		contentDAO.conferenceContentUpdate(id, title, image, description, location, link, date);
	}

	@Transactional
	public List<Conference> getConfereceImage(int id) {
		return contentDAO.getConfereceImage(id);
	}

	@Transactional
	public List<Conference> conferenceTable() {
		return contentDAO.conferenceTable();
	}

	@Transactional
	public void conferenceStatusUpdate(int id, String status) {
		contentDAO.conferenceStatusUpdate(id, status);
	}

	@Transactional
	public void deleteCarousel(int id) {
		contentDAO.deleteCarousel(id);
	}

	@Transactional
	public List<Carousel> getCarouselImage(int id) {
		return contentDAO.getCarouselImage(id);
	}

	@Transactional
	public void carouselUpdate(int id, byte[] image) {
		contentDAO.carouselUpdate(id, image);
	}

	@Transactional
	public void carouseleStatusUpdate(int id, String status) {
		contentDAO.carouseleStatusUpdate(id, status);
	}

	@Transactional
	public void newcarousel(byte[] image) {
		contentDAO.newcarousel(image);
	}

	@Transactional
	public List<Carousel> carouselResultWebsite() {
		return contentDAO.carouselResultWebsite();
	}

	@Transactional
	public List<Carousel> carouselResultMinId() {
		return contentDAO.carouselResultMinId();
	}

	@Transactional
	public Header_section headerContentAdmin(int id) {
		return contentDAO.headerContentAdmin(id);
	}

	@Transactional
	public List<Header_section> headerContentAdminList(int id) {
		return contentDAO.headerContentAdminList(id);
	}

	@Transactional
	public void headerSectionUpdate(int id, byte[] headerImage, String title, String subtitle, byte[] backgroundImage) {
		contentDAO.headerSectionUpdate(id, headerImage, title, subtitle, backgroundImage);
	}

	@Transactional
	public List<Header_section> getSectionHeaderImage(int id) {
		return contentDAO.getSectionHeaderImage(id);
	}

	@Transactional
	public List<Header_section> getSectionBackgroundImage(int id) {
		return contentDAO.getSectionBackgroundImage(id);
	}

	@Transactional
	public List<Jobs> jobContent() {
		return contentDAO.jobContent();
	}

	@Transactional
	public void saveJob(Jobs jobs) {
		contentDAO.saveJob(jobs);
	}

	@Transactional
	public void jobContentUpdate(int id, String companyname, String title, byte[] image, String address, String salary,
			String type, String link) {
		contentDAO.jobContentUpdate(id, companyname, title, image, address, salary, type, link);
	}

	@Transactional
	public void deleteJob(int id) {
		contentDAO.deleteJob(id);
	}

	@Transactional
	public void jobStatusUpdate(int id, String status) {
		contentDAO.jobStatusUpdate(id, status);
	}

	@Transactional
	public Jobs jobEditResult(int id) {
		return contentDAO.jobEditResult(id);
	}

	@Transactional
	public List<Jobs> getJobImage(int id) {
		return contentDAO.getJobImage(id);
	}

	@Transactional
	public List<Jobs> jobsWebsiteContent() {
		return contentDAO.jobsWebsiteContent();
	}

	@Transactional
	public List<Resources> resourceContent() {
		return contentDAO.resourceContent();
	}

	@Transactional
	public void saveResource(Resources resources) {
		contentDAO.saveResource(resources);
	}

	@Transactional
	public void deleteResource(int id) {
		contentDAO.deleteResource(id);
	}

	@Transactional
	public void resourceStatusUpdate(int id, String status) {
		contentDAO.resourceStatusUpdate(id, status);
	}

	@Transactional
	public Resources resourceEditResult(int id) {
		return contentDAO.resourceEditResult(id);
	}

	@Transactional
	public void resourceContentUpdate(int id, String name, String link) {
		contentDAO.resourceContentUpdate(id, name, link);
	}

	@Transactional
	public List<Resources> resourcesWebsiteContent() {
		return contentDAO.resourcesWebsiteContent();
	}

	@Transactional
	public List<Communities> communityContent() {
		return contentDAO.communityContent();
	}

	@Transactional
	public void saveCommunity(Communities communities) {
		contentDAO.saveCommunity(communities);
	}

	@Transactional
	public void deleteCommunity(int id) {
		contentDAO.deleteCommunity(id);
	}

	@Transactional
	public List<Communities> getCommunityImage(int id) {
		return contentDAO.getCommunityImage(id);
	}

	@Transactional
	public void communityStatusUpdate(int id, String status) {
		contentDAO.communityStatusUpdate(id, status);
	}

	@Transactional
	public Communities communityEditResult(int id) {
		return contentDAO.communityEditResult(id);
	}

	@Transactional
	public void communityContentUpdate(int id, String title, byte[] image, String date, String address, String link) {
		contentDAO.communityContentUpdate(id, title, image, date, address, link);
	}

	@Transactional
	public List<Communities> communityWebsiteContent() {
		return contentDAO.communityWebsiteContent();
	}

	@Transactional
	public List<Blogs> blogContent() {
		return contentDAO.blogContent();
	}

	@Transactional
	public void saveBlog(Blogs blogs) {
		contentDAO.saveBlog(blogs);
	}

	@Transactional
	public void deleteBlog(int id) {
		contentDAO.deleteBlog(id);
	}

	@Transactional
	public List<Blogs> getBlogImage(int id) {
		return contentDAO.getBlogImage(id);
	}

	@Transactional
	public void blogStatusUpdate(int id, String status) {
		contentDAO.blogStatusUpdate(id, status);
	}

	@Transactional
	public Blogs blogEditResult(int id) {
		return contentDAO.blogEditResult(id);
	}

	@Transactional
	public void blogContentUpdate(int id, String title, byte[] image, String author, String date, String category,
			String description, String link) {
		contentDAO.blogContentUpdate(id, title, image, author, date, category, description, link);
	}

	@Transactional
	public List<Blogs> blogWebsiteContent() {
		return contentDAO.blogWebsiteContent();
	}

	@Transactional
	public List<Blogs> blogDetailResult(String link) {
		return contentDAO.blogDetailResult(link);
	}

	@Transactional
	public List<Speakers> speakerContent() {
		return contentDAO.speakerContent();
	}

	@Transactional
	public void saveSpeaker(Speakers speakers) {
		contentDAO.saveSpeaker(speakers);
	}

	@Transactional
	public void deleteSpeaker(int id) {
		contentDAO.deleteSpeaker(id);
	}

	@Transactional
	public List<Speakers> getSpeakerImage(int id) {
		return contentDAO.getSpeakerImage(id);
	}

	@Transactional
	public void speakerStatusUpdate(int id, String status) {
		contentDAO.speakerStatusUpdate(id, status);
	}

	@Transactional
	public Speakers speakerEditResult(int id) {
		return contentDAO.speakerEditResult(id);
	}

	@Transactional
	public void speakerContentUpdate(int id, String name, byte[] image, String location, String category, String bio,
			String facebook, String twitter, String github, String latitude, String longitude, String link) {
		contentDAO.speakerContentUpdate(id, name, image, location, category, bio, facebook, twitter, github, latitude, longitude, link);
	}

	@Transactional
	public List<Speakers> speakerWebsiteContent() {
		return contentDAO.speakerWebsiteContent();
	}

	@Transactional
	public List<Speakers> speakerDetailResult(String link) {
		return contentDAO.speakerDetailResult(link);
	}

	@Transactional
	public List<Volunteers> volunteerContent() {
		return contentDAO.volunteerContent();
	}

	@Transactional
	public void saveVolunteer(Volunteers volunteer) {
		contentDAO.saveVolunteer(volunteer);
	}

	@Transactional
	public void volunteerStatusUpdate(int id, String status) {
		contentDAO.volunteerStatusUpdate(id, status);
	}

	@Transactional
	public List<Contact> contactContent() {
		return contentDAO.contactContent();
	}

	@Transactional
	public void saveContact(Contact contact) {
		contentDAO.saveContact(contact);
	}

	@Transactional
	public void contactStatusUpdate(int id, String responded) {
		contentDAO.contactStatusUpdate(id, responded);
	}

	@Transactional
	public List<Subscriber> subscriberContent() {
		return contentDAO.subscriberContent();
	}

	@Transactional
	public void saveSubscriber(Subscriber subscriber) {
		contentDAO.saveSubscriber(subscriber);
	}

	@Transactional
	public Long subscriberCount() {
		return contentDAO.subscriberCount();
	}

}
