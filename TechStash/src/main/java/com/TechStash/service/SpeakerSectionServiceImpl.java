package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.SpeakerSectionDAO;
import com.TechStash.entity.SpeakerSection;


@Service
public class SpeakerSectionServiceImpl implements SpeakerSectionService {
	
	@Autowired
	private SpeakerSectionDAO speakerSectionDAO;

	@Transactional
	public List<SpeakerSection> getResultWebsite() {
		return speakerSectionDAO.getResultWebsite();
	}

	@Transactional
	public SpeakerSection getResultAdmin() {
		return speakerSectionDAO.getResultAdmin();
	}

	@Transactional
	public void speakerSectionUpdate(String title, String buttontext, boolean status) {
		speakerSectionDAO.speakerSectionUpdate(title, buttontext, status);
	}

}
