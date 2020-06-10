package com.TechStash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="home_setting")
public class Home_setting {
	
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
	
	@Lob
	@Column(name="favicon")
	private byte[] favicon;
	
	@Transient
    private String encodedImage;
	
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

	public byte[] getFavicon() {
		return favicon;
	}

	public void setFavicon(byte[] favicon) {
		this.favicon = favicon;
	}

	public String getEncodedImage() {
		return encodedImage;
	}

	public void setEncodedImage(String encodedImage) {
		this.encodedImage = encodedImage;
	}
	
}
