package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.PodcastSectionDAO;
import com.TechStash.entity.PodcastSection;

@Service
public class PodcastSectionServiceImpl implements PodcastSectionService {

	@Autowired
	private PodcastSectionDAO podcastSectionDAO;

	@Transactional
	public List<PodcastSection> getImage(int id) {
		return podcastSectionDAO.getImage(id);
	}

	@Transactional
	public List<PodcastSection> getResultWebsite() {
		return podcastSectionDAO.getResultWebsite();
	}

	@Transactional
	public PodcastSection getResultAdmin() {
		return podcastSectionDAO.getResultAdmin();
	}

	@Transactional
	public void podcastSectionUpdate(byte[] image, String title, String subtitle, String buttontext, boolean status) {
		podcastSectionDAO.podcastSectionUpdate(image, title, subtitle, buttontext, status);
	}
}
