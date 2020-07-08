package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.ContentDAO;
import com.TechStash.entity.Carousel;
import com.TechStash.entity.Conference;
import com.TechStash.entity.Header_section;
import com.TechStash.entity.Jobs;

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

}
