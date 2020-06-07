package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.JobSectionDAO;
import com.TechStash.entity.JobSection;


@Service
public class JobSectionServiceImpl implements JobSectionService {

	@Autowired
	private JobSectionDAO jobSectionDAO;

	@Transactional
	public List<JobSection> getImage(int id) {
		return jobSectionDAO.getImage(id);
	}

	@Transactional
	public List<JobSection> getResultWebsite() {
		return jobSectionDAO.getResultWebsite();
	}

	@Transactional
	public JobSection getResultAdmin() {
		return jobSectionDAO.getResultAdmin();
	}

	@Transactional
	public void jobSectionUpdate(byte[] image, String title, String subtitle, String buttontextleft,
			String buttontextright, boolean status) {
		jobSectionDAO.jobSectionUpdate(image, title, subtitle, buttontextleft, buttontextright, status);
	}
	
}
