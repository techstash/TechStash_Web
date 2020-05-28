package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.FooterDAO;
import com.TechStash.entity.Dashboard_users;
import com.TechStash.entity.Footer;

@Service
public class FooterServiceImpl implements FooterService {

	@Autowired
	private FooterDAO footerDAO;

	@Transactional
	public Footer getDetails(int id) {
		
		return footerDAO.getDetails(id);
	}

	@Transactional
	public void footerUpdate(int id, byte[] image, String footer_text, String facebook_url, String twitter_url,
			String youtube_url, String linkedin_url) {
		
		footerDAO.footerUpdate(id, image, footer_text, facebook_url, twitter_url, youtube_url, linkedin_url);
	}

	@Transactional
	public List<Footer> getLogoImage(int id) {
		// TODO Auto-generated method stub
		return footerDAO.getLogoImage(id);
	}
	
}
