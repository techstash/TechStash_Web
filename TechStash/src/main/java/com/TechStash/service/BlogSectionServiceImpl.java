package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.BlogSectionDAO;
import com.TechStash.entity.BlogSection;


@Service
public class BlogSectionServiceImpl implements BlogSectionService {

	@Autowired
	private BlogSectionDAO blogSectionDAO;

	@Transactional
	public List<BlogSection> getImage(int id) {
		return blogSectionDAO.getImage(id);
	}

	@Transactional
	public List<BlogSection> getResultWebsite() {
		return blogSectionDAO.getResultWebsite();
	}

	@Transactional
	public BlogSection getResultAdmin() {
		return blogSectionDAO.getResultAdmin();
	}

	@Transactional
	public void blogSectionUpdate(byte[] image, String title, String subtitle, String buttontextleft,
			String buttontextright, boolean status) {
		blogSectionDAO.blogSectionUpdate(image, title, subtitle, buttontextleft, buttontextright, status);
	}
	
}
