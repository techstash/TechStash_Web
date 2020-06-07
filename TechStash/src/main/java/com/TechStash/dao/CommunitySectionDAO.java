package com.TechStash.dao;

import java.util.List;

import com.TechStash.entity.CommunitySection;

public interface CommunitySectionDAO {

	public List<CommunitySection> getImage(int id);

	public List<CommunitySection> getResultWebsite();
	
	public CommunitySection getResultAdmin();
	
	public void communitySectionUpdate(byte[] image, String title, String subtitle, String buttontextleft, String buttontextright, boolean status);
}
