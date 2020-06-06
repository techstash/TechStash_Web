package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.AboutUsDAO;
import com.TechStash.entity.Aboutus;


@Service
public class AboutUsServiceImpl implements AboutUsService {
	
	@Autowired
	private AboutUsDAO aboutUsDAO;

	@Transactional
	public void saveContent(String content) {

		aboutUsDAO.saveContent(content);
	}

	@Transactional
	public Aboutus getResult() {
		// TODO Auto-generated method stub
		return aboutUsDAO.getResult();
	}
	
	@Transactional
	public List<Aboutus> getContent() {
		// TODO Auto-generated method stub
		return aboutUsDAO.getContent();
	}

}
