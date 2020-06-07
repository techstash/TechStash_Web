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
@Table(name="communitysection")
public class CommunitySection {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	 
	@Lob
	@Column(name="image")
	private byte[] image;
	
	@Column(name="title")
	private String title;
	
	@Column(name="subtitle")
	private String subtitle;
	
	@Column(name="buttontextleft")
	private String buttontextleft;
	
	@Column(name="buttontextright")
	private String buttontextright;
	
	@Column(name="status")
	private boolean status;
	
	@Transient
    private String encodedImage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getButtontextleft() {
		return buttontextleft;
	}

	public void setButtontextleft(String buttontextleft) {
		this.buttontextleft = buttontextleft;
	}

	public String getButtontextright() {
		return buttontextright;
	}

	public void setButtontextright(String buttontextright) {
		this.buttontextright = buttontextright;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getEncodedImage() {
		return encodedImage;
	}

	public void setEncodedImage(String encodedImage) {
		this.encodedImage = encodedImage;
	}
	

}
