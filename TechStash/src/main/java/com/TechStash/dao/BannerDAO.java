package com.TechStash.dao;

import java.util.List;

import com.TechStash.entity.Banner;

public interface BannerDAO {

	public Banner getContent();
	
	public List<Banner> getImage(int id);
	
	public List<Banner> getDetail();
	
	public void bannerUpdate(byte[] image, String title, String subtitle, boolean status);
}
