package com.TechStash.dao;

import java.util.List;

import com.TechStash.entity.ConferenceSection;

public interface ConferenceSectionDAO {
	
	public List<ConferenceSection> getImage(int id);
	
	public List<ConferenceSection> getResultWebsite();
	
	public ConferenceSection getResultAdmin();
	
	public void conferenceSectionupdate(byte[] image, String title, String subtitle, String buttontextleft, String buttontextright, boolean status);

}
