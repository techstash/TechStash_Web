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
@Table(name="header_section")
public class Header_section {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Lob
	@Column(name="headerimage")
	private byte[] headerimage;
	
	@Column(name="title")
	private String title;
	
	@Column(name="subtitle")
	private String subtitle;
	
	@Lob
	@Column(name="backgroundimage")
	private byte[] backgroundimage;
	
	@Transient
    private String encodedHeaderimage;
	
	@Transient
    private String encodedBackgroundimage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getHeaderimage() {
		return headerimage;
	}

	public void setHeaderimage(byte[] headerimage) {
		this.headerimage = headerimage;
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

	public byte[] getBackgroundimage() {
		return backgroundimage;
	}

	public void setBackgroundimage(byte[] backgroundimage) {
		this.backgroundimage = backgroundimage;
	}

	public String getEncodedHeaderimage() {
		return encodedHeaderimage;
	}

	public void setEncodedHeaderimage(String encodedHeaderimage) {
		this.encodedHeaderimage = encodedHeaderimage;
	}

	public String getEncodedBackgroundimage() {
		return encodedBackgroundimage;
	}

	public void setEncodedBackgroundimage(String encodedBackgroundimage) {
		this.encodedBackgroundimage = encodedBackgroundimage;
	}
	
}
