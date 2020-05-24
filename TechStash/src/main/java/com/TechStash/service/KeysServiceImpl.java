package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.DashboardUsersDAO;
import com.TechStash.dao.KeysDAO;
import com.TechStash.entity.Keys_details;

@Service
public class KeysServiceImpl implements KeysService {
	
	@Autowired
	private KeysDAO keysDAO;

	@Transactional
	public void keysAdd(String keyName, String KeyValue) {
		keysDAO.keysAdd(keyName, KeyValue);
	}

	@Transactional
	public List<Keys_details> getKeys() {
		// TODO Auto-generated method stub
		return keysDAO.getKeys();
	}

}
