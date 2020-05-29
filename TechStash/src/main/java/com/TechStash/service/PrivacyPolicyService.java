package com.TechStash.service;

import java.util.List;

import com.TechStash.entity.PrivacyPolicy;

public interface PrivacyPolicyService {
	
public void saveContent(String content);
	
	public List<PrivacyPolicy> getContent();

}
