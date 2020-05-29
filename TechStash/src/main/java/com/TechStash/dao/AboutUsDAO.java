package com.TechStash.dao;
import java.util.List;

import com.TechStash.entity.Aboutus;

public interface AboutUsDAO {

	public void saveContent(String content);
	
	public List<Aboutus> getContent();
	
}
