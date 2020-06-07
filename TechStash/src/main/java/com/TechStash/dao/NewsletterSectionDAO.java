package com.TechStash.dao;

import java.util.List;

import com.TechStash.entity.NewsletterSection;

public interface NewsletterSectionDAO {

	public List<NewsletterSection> getImage(int id);

	public List<NewsletterSection> getResultWebsite();
	
	public NewsletterSection getResultAdmin();
	
	public void newsletterSectionUpdate(byte[] image, String title, boolean status);
}
