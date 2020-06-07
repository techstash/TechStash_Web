package com.TechStash.service;

import java.util.List;

import com.TechStash.entity.Banner;

public interface BannerService {

	public Banner getContent();
	
	public List<Banner> getDetail();
	
	public List<Banner> getImage(int id);
	
	public void bannerUpdate(byte[] image, String title, String subtitle, Boolean status);
}
