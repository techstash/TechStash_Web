package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.ConferenceSectionDAO;
import com.TechStash.entity.ConferenceSection;

@Service
public class ConferenceSectionServiceImpl implements ConferenceSectionService {

	@Autowired
	private ConferenceSectionDAO conferenceSectionDAO;

	@Transactional
	public List<ConferenceSection> getImage(int id) {
		return conferenceSectionDAO.getImage(id);
	}

	@Transactional
	public List<ConferenceSection> getResultWebsite() {
		return conferenceSectionDAO.getResultWebsite();
	}

	@Transactional
	public ConferenceSection getResultAdmin() {
		return conferenceSectionDAO.getResultAdmin();
	}

	@Transactional
	public void conferenceSectionupdate(byte[] image, String title, String subtitle, String buttontextleft,
			String buttontextright, boolean status) {
		conferenceSectionDAO.conferenceSectionupdate(image, title, subtitle, buttontextleft, buttontextright, status);
	}
}
