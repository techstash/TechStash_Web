package com.TechStash.service;

import java.util.List;

import com.TechStash.entity.BlogSection;

public interface BlogSectionService {

	public List<BlogSection> getImage(int id);

	public List<BlogSection> getResultWebsite();
	
	public BlogSection getResultAdmin();
	
	public void blogSectionUpdate(byte[] image, String title, String subtitle, String buttontextleft, String buttontextright, boolean status);
}
