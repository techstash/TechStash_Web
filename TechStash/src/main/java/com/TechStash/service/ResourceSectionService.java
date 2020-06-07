package com.TechStash.service;

import java.util.List;

import com.TechStash.entity.ResourceSection;

public interface ResourceSectionService {

	public List<ResourceSection> getImage(int id);

	public List<ResourceSection> getResultWebsite();
	
	public ResourceSection getResultAdmin();
	
	public void resourceSectionUpdate(byte[] image, String title, String subtitle, String buttontext, boolean status);
}
