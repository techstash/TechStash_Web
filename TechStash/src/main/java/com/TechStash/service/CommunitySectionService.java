package com.TechStash.service;

import java.util.List;

import com.TechStash.entity.CommunitySection;

public interface CommunitySectionService {

	public List<CommunitySection> getImage(int id);

	public List<CommunitySection> getResultWebsite();
	
	public CommunitySection getResultAdmin();
	
	public void communitySectionUpdate(byte[] image, String title, String subtitle, String buttontextleft, String buttontextright, boolean status);
}
