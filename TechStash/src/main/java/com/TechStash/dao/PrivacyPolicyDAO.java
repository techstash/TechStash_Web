package com.TechStash.dao;

import java.util.List;

import com.TechStash.entity.PrivacyPolicy;

public interface PrivacyPolicyDAO {
	
public void saveContent(String content);
	
	public List<PrivacyPolicy> getContent();

}
