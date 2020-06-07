package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.NewsletterSectionDAO;
import com.TechStash.entity.NewsletterSection;


@Service
public class NewsletterSectionServiceImpl implements NewsletterSectionService {
	
	@Autowired
	private NewsletterSectionDAO newsletterSectionDAO;

	@Transactional
	public List<NewsletterSection> getImage(int id) {
		return newsletterSectionDAO.getImage(id);
	}

	@Transactional
	public List<NewsletterSection> getResultWebsite() {
		return newsletterSectionDAO.getResultWebsite();
	}

	@Transactional
	public NewsletterSection getResultAdmin() {
		return newsletterSectionDAO.getResultAdmin();
	}

	@Transactional
	public void newsletterSectionUpdate(byte[] image, String title, boolean status) {
		newsletterSectionDAO.newsletterSectionUpdate(image, title, status);
	}

}
