package com.TechStash.service;

import java.util.List;

import com.TechStash.entity.Keys_details;

public interface KeysService {
	
	public void keysAdd(String keyName, String KeyValue);
	
	public List<Keys_details> getKeys();
}
