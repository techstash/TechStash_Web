package com.TechStash.dao;

import java.util.List;

import com.TechStash.entity.Footer;

public interface FooterDAO {

	public Footer getDetails(int id);
	
	public List<Footer> getLogoImage(int id);
	
	public void footerUpdate(int id, byte[] image, String footer_text, String facebook_url, String twitter_url, String youtube_url, String linkedin_url);
}
