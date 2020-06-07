package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.ResourceSectionDAO;
import com.TechStash.entity.ResourceSection;

@Service
public class ResourceSectionServiceImpl implements ResourceSectionService {

	@Autowired
	private ResourceSectionDAO resourcesSectionDAO;

	@Transactional
	public List<ResourceSection> getImage(int id) {
		return resourcesSectionDAO.getImage(id);
	}

	@Transactional
	public List<ResourceSection> getResultWebsite() {
		return resourcesSectionDAO.getResultWebsite();
	}

	@Transactional
	public ResourceSection getResultAdmin() {
		return resourcesSectionDAO.getResultAdmin();
	}

	@Transactional
	public void resourceSectionUpdate(byte[] image, String title, String subtitle, String buttontext, boolean status) {
		resourcesSectionDAO.resourceSectionUpdate(image, title, subtitle, buttontext, status);
	}
}
