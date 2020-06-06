package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.BannerDAO;
import com.TechStash.entity.Banner;

@Service
public class BannerServiceImpl implements BannerService {
	
	@Autowired
	private BannerDAO bannerDAO;

	@Transactional
	public Banner getContent() {
		return bannerDAO.getContent();
	}

	@Transactional
	public List<Banner> getImage(int id) {
		return bannerDAO.getImage(id);
	}

	@Transactional
	public void bannerUpdate(byte[] image, String title, String subtitle, String status) {
		bannerDAO.bannerUpdate(image, title, subtitle, status);
	}

	@Transactional
	public List<Banner> getDetail() {
		return bannerDAO.getDetail();
	}

}
