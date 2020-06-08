package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.PrivacyPolicyDAO;
import com.TechStash.entity.PrivacyPolicy;

@Service
public class PrivacyPolicyServiceImpl implements PrivacyPolicyService {
	
	@Autowired
	private PrivacyPolicyDAO privacyPolicyDAO;

	@Transactional
	public void saveContent(String content) {
		privacyPolicyDAO.saveContent(content);
	}

	@Transactional
	public List<PrivacyPolicy> getContent() {
		return privacyPolicyDAO.getContent();
	}

	@Transactional
	public PrivacyPolicy getResult() {
		return privacyPolicyDAO.getResult();
	}

}
