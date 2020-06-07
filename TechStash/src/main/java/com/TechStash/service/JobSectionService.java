package com.TechStash.service;

import java.util.List;

import com.TechStash.entity.JobSection;

public interface JobSectionService {

	public List<JobSection> getImage(int id);

	public List<JobSection> getResultWebsite();
	
	public JobSection getResultAdmin();
	
	public void jobSectionUpdate(byte[] image, String title, String subtitle, String buttontextleft, String buttontextright, boolean status);
}
