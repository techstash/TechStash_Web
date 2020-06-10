package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.HomeSettingDAO;
import com.TechStash.entity.Home_setting;


@Service
public class HomeSettingServiceImpl implements HomeSettingService {
	
	@Autowired
	private HomeSettingDAO homeSettingDAO;

	@Transactional
	public Home_setting getContent() {
		return homeSettingDAO.getContent();
	}

	@Transactional
	public List<Home_setting> getImage(int id) {
		return homeSettingDAO.getImage(id);
	}

	@Transactional
	public List<Home_setting> getResultWebsite() {
		return homeSettingDAO.getResultWebsite();
	}

	@Transactional
	public void homeSettingUpdate(String metatitle, String metadescription, String browsertitle, byte[] favicon) {
		homeSettingDAO.homeSettingUpdate(metatitle, metadescription, browsertitle, favicon);
	}

}
