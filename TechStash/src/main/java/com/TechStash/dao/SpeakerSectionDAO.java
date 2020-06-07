package com.TechStash.dao;

import java.util.List;

import com.TechStash.entity.SpeakerSection;

public interface SpeakerSectionDAO {
	
	public List<SpeakerSection> getResultWebsite();
	
	public SpeakerSection getResultAdmin();
	
	public void speakerSectionUpdate(String title, String buttontext, boolean status);
}
