package com.TechStash.dao;
import java.util.List;

import com.TechStash.entity.Aboutus;
import com.TechStash.entity.Dashboard_users;

public interface AboutUsDAO {

	public void saveContent(String content);
	
	public Aboutus getResult();
	
	public List<Aboutus> getContent();
	
}
