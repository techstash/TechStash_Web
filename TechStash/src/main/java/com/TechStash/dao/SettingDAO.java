package com.TechStash.dao;

import java.util.List;

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

public interface SettingDAO {

    public Conference_setting conferenceContent();
	public List<Conference_setting> conferenceResultWebsite();
	public void conferenceSettingUpdate(String metatitle, String metadescription, String browsertitle);
	
	public Job_setting jobContent();
	public List<Job_setting> jobResultWebsite();
	public void jobSettingUpdate(String metatitle, String metadescription, String browsertitle);
	
	public Speaker_setting speakerContent();
	public List<Speaker_setting> speakerResultWebsite();
	public void speakerSettingUpdate(String metatitle, String metadescription, String browsertitle);
	
	public Blog_setting blogContent();
	public List<Blog_setting> blogResultWebsite();
	public void blogSettingUpdate(String metatitle, String metadescription, String browsertitle);
	
	public Podcast_setting podcastContent();
	public List<Podcast_setting> podcastResultWebsite();
	public void podcastSettingUpdate(String metatitle, String metadescription, String browsertitle);
	
	public Community_setting communityContent();
	public List<Community_setting> communityResultWebsite();
	public void communitySettingUpdate(String metatitle, String metadescription, String browsertitle);
	
	public Resource_setting resourceContent();
	public List<Resource_setting> resourceResultWebsite();
	public void resourceSettingUpdate(String metatitle, String metadescription, String browsertitle);
	
	public Volunteer_setting volunteerContent();
	public List<Volunteer_setting> volunteerResultWebsite();
	public void volunteerSettingUpdate(String metatitle, String metadescription, String browsertitle);
	
	public Subscribe_setting subscribeContent();
	public List<Subscribe_setting> subscriberResultWebsite();
	public void subscribeSettingUpdate(String metatitle, String metadescription, String browsertitle);
	
	public Contactus_setting contactusContent();
	public List<Contactus_setting> cotactusResultWebsite();
	public void contactusSettingUpdate(String metatitle, String metadescription, String browsertitle);
	
	public Aboutus_setting aboutusContent();
	public List<Aboutus_setting> aboutusResultWebsite();
	public void aboutusSettingUpdate(String metatitle, String metadescription, String browsertitle);
	
	public Privacypolicy_setting privacypolicyContent();
	public List<Privacypolicy_setting> privacypolicyResultWebsite();
	public void privacypolicySettingUpdate(String metatitle, String metadescription, String browsertitle);
	
	public Faq_setting faqContent();
	public List<Faq_setting> faqResultWebsite();
	public void faqSettingUpdate(String metatitle, String metadescription, String browsertitle);
	
}
