package com.TechStash.service;
import java.util.List;

import com.TechStash.entity.Home_setting;

public interface HomeSettingService {
	
	public Home_setting getContent();
	
	public List<Home_setting> getImage(int id);
	
	public List<Home_setting> getResultWebsite();
	
	public void homeSettingUpdate(String metatitle, String metadescription, String browsertitle, byte[] favicon);

}
