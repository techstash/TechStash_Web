package com.TechStash.service;

import java.util.List;

import com.TechStash.entity.PodcastSection;

public interface PodcastSectionService {

	public List<PodcastSection> getImage(int id);

	public List<PodcastSection> getResultWebsite();
	
	public PodcastSection getResultAdmin();
	
	public void podcastSectionUpdate(byte[] image, String title, String subtitle, String buttontext, boolean status);
}
