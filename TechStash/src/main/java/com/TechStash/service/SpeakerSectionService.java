package com.TechStash.service;

import java.util.List;

import com.TechStash.entity.SpeakerSection;

public interface SpeakerSectionService {

	public List<SpeakerSection> getResultWebsite();
	
	public SpeakerSection getResultAdmin();
	
	public void speakerSectionUpdate(String title, String buttontext, boolean status);
}
