package com.TechStash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="privacypolicy_setting")
public class Privacypolicy_setting {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="metatitle")
	private String metatitle;
	
	@Column(name="metadescription")
	private String metadescription;
	
	@Column(name="browsertitle")
	private String browsertitle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMetatitle() {
		return metatitle;
	}

	public void setMetatitle(String metatitle) {
		this.metatitle = metatitle;
	}

	public String getMetadescription() {
		return metadescription;
	}

	public void setMetadescription(String metadescription) {
		this.metadescription = metadescription;
	}

	public String getBrowsertitle() {
		return browsertitle;
	}

	public void setBrowsertitle(String browsertitle) {
		this.browsertitle = browsertitle;
	}
	

}
