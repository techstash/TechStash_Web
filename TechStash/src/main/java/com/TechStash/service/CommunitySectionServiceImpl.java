package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.CommunitySectionDAO;
import com.TechStash.entity.CommunitySection;


@Service
public class CommunitySectionServiceImpl implements CommunitySectionService {

	@Autowired
	private CommunitySectionDAO communitySectionDAO;

	@Transactional
	public List<CommunitySection> getImage(int id) {
		return communitySectionDAO.getImage(id);
	}

	@Transactional
	public List<CommunitySection> getResultWebsite() {
		return communitySectionDAO.getResultWebsite();
	}

	@Transactional
	public CommunitySection getResultAdmin() {
		return communitySectionDAO.getResultAdmin();
	}

	@Transactional
	public void communitySectionUpdate(byte[] image, String title, String subtitle, String buttontextleft,
			String buttontextright, boolean status) {
		communitySectionDAO.communitySectionUpdate(image, title, subtitle, buttontextleft, buttontextright, status);
	}
}
