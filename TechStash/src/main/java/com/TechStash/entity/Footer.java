package com.TechStash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="footer")
public class Footer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Lob
	@Column(name="logo_image")
	private byte[] logo_image;
	
	@Column(name="footer_text")
	private String footer_text;
	
	@Column(name="facebook_url")
	private String facebook_url;
	
	@Column(name="twitter_url")
	private String twitter_url;
	
	@Column(name="youtube_url")
	private String youtube_url;
	
	@Column(name="linkedin_url")
	private String linkedin_url;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getLogo_image() {
		return logo_image;
	}

	public void setLogo_image(byte[] logo_image) {
		this.logo_image = logo_image;
	}

	public String getFooter_text() {
		return footer_text;
	}

	public void setFooter_text(String footer_text) {
		this.footer_text = footer_text;
	}

	public String getFacebook_url() {
		return facebook_url;
	}

	public void setFacebook_url(String facebook_url) {
		this.facebook_url = facebook_url;
	}

	public String getTwitter_url() {
		return twitter_url;
	}

	public void setTwitter_url(String twitter_url) {
		this.twitter_url = twitter_url;
	}

	public String getYoutube_url() {
		return youtube_url;
	}

	public void setYoutube_url(String youtube_url) {
		this.youtube_url = youtube_url;
	}

	public String getLinkedin_url() {
		return linkedin_url;
	}

	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}
	
	
	
	
}
