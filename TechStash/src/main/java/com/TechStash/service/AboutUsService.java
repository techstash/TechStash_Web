package com.TechStash.service;

import java.util.List;

import com.TechStash.entity.Aboutus;

public interface AboutUsService {

	public void saveContent(String content);
	
	public List<Aboutus> getContent();
}
