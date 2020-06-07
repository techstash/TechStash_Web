package com.TechStash.dao;

import java.util.List;

import com.TechStash.entity.BlogSection;

public interface BlogSectionDAO {

	public List<BlogSection> getImage(int id);

	public List<BlogSection> getResultWebsite();
	
	public BlogSection getResultAdmin();
	
	public void blogSectionUpdate(byte[] image, String title, String subtitle, String buttontextleft, String buttontextright, boolean status);
}
