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
@Table(name="pricing_details")
public class Pricing_details {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="planname")
	private String planname;
	
	@Lob
	@Column(name="image")
	private byte[] image;
	
	@Column(name="planprice")
	private String planprice;
	
	@Column(name="planservice")
	private String planservice;
	
	@Transient
    private String encodedImage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlanname() {
		return planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getPlanprice() {
		return planprice;
	}

	public void setPlanprice(String planprice) {
		this.planprice = planprice;
	}

	public String getPlanservice() {
		return planservice;
	}

	public void setPlanservice(String planservice) {
		this.planservice = planservice;
	}

	public String getEncodedImage() {
		return encodedImage;
	}

	public void setEncodedImage(String encodedImage) {
		this.encodedImage = encodedImage;
	}
	
}
