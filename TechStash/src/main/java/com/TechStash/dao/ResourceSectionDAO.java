package com.TechStash.dao;

import java.util.List;

import com.TechStash.entity.ResourceSection;

public interface ResourceSectionDAO {

	public List<ResourceSection> getImage(int id);

	public List<ResourceSection> getResultWebsite();
	
	public ResourceSection getResultAdmin();
	
	public void resourceSectionUpdate(byte[] image, String title, String subtitle, String buttontext, boolean status);
}
