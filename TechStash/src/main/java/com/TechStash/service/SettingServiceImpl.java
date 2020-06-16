package com.TechStash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechStash.dao.SettingDAO;
import com.TechStash.entity.Aboutus_setting;
import com.TechStash.entity.Blog_setting;
import com.TechStash.entity.Community_setting;
import com.TechStash.entity.Conference_setting;
import com.TechStash.entity.Contactus_setting;
import com.TechStash.entity.Faq_setting;
import com.TechStash.entity.Job_setting;
import com.TechStash.entity.Podcast_setting;
import com.TechStash.entity.Privacypolicy_setting;
import com.TechStash.entity.Resource_setting;
import com.TechStash.entity.Speaker_setting;
import com.TechStash.entity.Subscribe_setting;
import com.TechStash.entity.Volunteer_setting;


@Service
public class SettingServiceImpl implements SettingService {
	
	@Autowired
	private SettingDAO settingDAO;

	@Transactional
	public Conference_setting conferenceContent() {
		return settingDAO.conferenceContent();
	}

	@Transactional
	public List<Conference_setting> conferenceResultWebsite() {
		return settingDAO.conferenceResultWebsite();
	}

	@Transactional
	public void conferenceSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.conferenceSettingUpdate(metatitle, metadescription, browsertitle);
	}

	@Transactional
	public Job_setting jobContent() {
		return settingDAO.jobContent();
	}

	@Transactional
	public List<Job_setting> jobResultWebsite() {
		return settingDAO.jobResultWebsite();
	}

	@Transactional
	public void jobSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.jobSettingUpdate(metatitle, metadescription, browsertitle);
	}

	@Transactional
	public Speaker_setting speakerContent() {
		return settingDAO.speakerContent();
	}

	@Transactional
	public List<Speaker_setting> speakerResultWebsite() {
		return settingDAO.speakerResultWebsite();
	}

	@Transactional
	public void speakerSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.speakerSettingUpdate(metatitle, metadescription, browsertitle);
	}

	@Transactional
	public Blog_setting blogContent() {
		return settingDAO.blogContent();
	}

	@Transactional
	public List<Blog_setting> blogResultWebsite() {
		return settingDAO.blogResultWebsite();
	}

	@Transactional
	public void blogSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.blogSettingUpdate(metatitle, metadescription, browsertitle);
	}

	@Transactional
	public Podcast_setting podcastContent() {
		return settingDAO.podcastContent();
	}

	@Transactional
	public List<Podcast_setting> podcastResultWebsite() {
		return settingDAO.podcastResultWebsite();
	}

	@Transactional
	public void podcastSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.podcastSettingUpdate(metatitle, metadescription, browsertitle);
	}

	@Transactional
	public Community_setting communityContent() {
		return settingDAO.communityContent();
	}

	@Transactional
	public List<Community_setting> communityResultWebsite() {
		return settingDAO.communityResultWebsite();
	}

	@Transactional
	public void communitySettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.communitySettingUpdate(metatitle, metadescription, browsertitle);
	}

	@Transactional
	public Resource_setting resourceContent() {
		return settingDAO.resourceContent();
	}

	@Transactional
	public List<Resource_setting> resourceResultWebsite() {
		return settingDAO.resourceResultWebsite();
	}

	@Transactional
	public void resourceSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.resourceSettingUpdate(metatitle, metadescription, browsertitle);
	}

	@Transactional
	public Volunteer_setting volunteerContent() {
		return settingDAO.volunteerContent();
	}

	@Transactional
	public List<Volunteer_setting> volunteerResultWebsite() {
		return settingDAO.volunteerResultWebsite();
	}

	@Transactional
	public void volunteerSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.volunteerSettingUpdate(metatitle, metadescription, browsertitle);
	}

	@Transactional
	public Subscribe_setting subscribeContent() {
		return settingDAO.subscribeContent();
	}

	@Transactional
	public List<Subscribe_setting> subscriberResultWebsite() {
		return settingDAO.subscriberResultWebsite();
	}

	@Transactional
	public void subscribeSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.subscribeSettingUpdate(metatitle, metadescription, browsertitle);
	}

	@Transactional
	public Contactus_setting contactusContent() {
		return settingDAO.contactusContent();
	}

	@Transactional
	public List<Contactus_setting> cotactusResultWebsite() {
		return settingDAO.cotactusResultWebsite();
	}

	@Transactional
	public void contactusSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.contactusSettingUpdate(metatitle, metadescription, browsertitle);
	}

	@Transactional
	public Aboutus_setting aboutusContent() {
		return settingDAO.aboutusContent();
	}

	@Transactional
	public List<Aboutus_setting> aboutusResultWebsite() {
		return settingDAO.aboutusResultWebsite();
	}

	@Transactional
	public void aboutusSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.aboutusSettingUpdate(metatitle, metadescription, browsertitle);
	}

	@Transactional
	public Privacypolicy_setting privacypolicyContent() {
		return settingDAO.privacypolicyContent();
	}

	@Transactional
	public List<Privacypolicy_setting> privacypolicyResultWebsite() {
		return settingDAO.privacypolicyResultWebsite();
	}

	@Transactional
	public void privacypolicySettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.privacypolicySettingUpdate(metatitle, metadescription, browsertitle);		
	}

	@Transactional
	public Faq_setting faqContent() {
		return settingDAO.faqContent();
	}

	@Transactional
	public List<Faq_setting> faqResultWebsite() {
		return settingDAO.faqResultWebsite();
	}

	@Transactional
	public void faqSettingUpdate(String metatitle, String metadescription, String browsertitle) {
		settingDAO.faqSettingUpdate(metatitle, metadescription, browsertitle);		
	}

}
