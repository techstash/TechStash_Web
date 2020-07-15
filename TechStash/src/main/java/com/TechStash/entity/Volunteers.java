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
@Table(name="volunteers")
public class Volunteers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="city")
	private String city;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="education")
	private String education;
	
	@Column(name="specialization")
	private String Specialization;
	
	@Column(name="hours")
	private String hours;
	
	@Column(name="details")
	private String details;
	
	@Column(name="linkedin")
	private String linkedin;
	
	@Column(name="github")
	private String github;
	
	@Column(name="twitter")
	private String twitter;
	
	@Column(name="portfolio")
	private String portfolio;
	
	@Lob
	@Column(name="image")
	private byte[] image;
	
	@Column(name="hear_about_techstash")
	private String hear_about_techstash;
	
	@Column(name="ideas_to_techstash")
	private String ideas_to_techstash;
	
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getHear_about_techstash() {
		return hear_about_techstash;
	}

	public void setHear_about_techstash(String hear_about_techstash) {
		this.hear_about_techstash = hear_about_techstash;
	}

	public String getIdeas_to_techstash() {
		return ideas_to_techstash;
	}

	public void setIdeas_to_techstash(String ideas_to_techstash) {
		this.ideas_to_techstash = ideas_to_techstash;
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
