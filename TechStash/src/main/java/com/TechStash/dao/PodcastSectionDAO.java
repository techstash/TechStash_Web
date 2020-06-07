package com.TechStash.dao;

import java.util.List;

import com.TechStash.entity.PodcastSection;

public interface PodcastSectionDAO {

	public List<PodcastSection> getImage(int id);

	public List<PodcastSection> getResultWebsite();
	
	public PodcastSection getResultAdmin();
	
	public void podcastSectionUpdate(byte[] image, String title, String subtitle, String buttontext, boolean status);
}
