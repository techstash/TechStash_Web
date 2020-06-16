package com.TechStash;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.TechStash.entity.Banner;
import com.TechStash.entity.BlogSection;
import com.TechStash.entity.CommunitySection;
import com.TechStash.entity.ConferenceSection;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.JobSection;
import com.TechStash.entity.NewsletterSection;
import com.TechStash.entity.PodcastSection;
import com.TechStash.entity.ResourceSection;
import com.TechStash.entity.SpeakerSection;
import com.TechStash.service.BannerService;
import com.TechStash.service.BlogSectionService;
import com.TechStash.service.CommunitySectionService;
import com.TechStash.service.ConferenceSectionService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.JobSectionService;
import com.TechStash.service.NewsletterSectionService;
import com.TechStash.service.PodcastSectionService;
import com.TechStash.service.ResourceSectionService;
import com.TechStash.service.SpeakerSectionService;


@Controller
public class HomeContentController {

	@Autowired
	private BannerService bannerService;
	
	@Autowired
	private ConferenceSectionService conferenceSectionService;
	
	@Autowired
	private JobSectionService jobSectionService;
	
	@Autowired
	private SpeakerSectionService speakerSectionService;
	
	@Autowired
	private BlogSectionService blogSectionService;
	
	@Autowired
	private PodcastSectionService podcastSectionService;
	
	@Autowired
	private CommunitySectionService communitySectionService;
	
	@Autowired
	private NewsletterSectionService newsletterSectionService;
	
	@Autowired
	private ResourceSectionService resourceSectionService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@RequestMapping("/")
	public String Home(Model theModel){
		
		List<Banner> dbResultBanner = bannerService.getDetail();
		theModel.addAttribute("banner", dbResultBanner);
		
		List<ConferenceSection> dbResultConference = conferenceSectionService.getResultWebsite();
		theModel.addAttribute("conferenesection", dbResultConference);
		
		List<JobSection> dbResultJob = jobSectionService.getResultWebsite();
		theModel.addAttribute("jobsection", dbResultJob);
		
		List<SpeakerSection> dbResultSpeaker = speakerSectionService.getResultWebsite();
		theModel.addAttribute("speakersection", dbResultSpeaker);
		
		List<BlogSection> dbResultBlog = blogSectionService.getResultWebsite();
		theModel.addAttribute("blogsection", dbResultBlog);
		
		List<PodcastSection> dbResultPodcast = podcastSectionService.getResultWebsite();
		theModel.addAttribute("podcastsection", dbResultPodcast);
		
		List<CommunitySection> dbResultCommunity = communitySectionService.getResultWebsite();
		theModel.addAttribute("communitysection", dbResultCommunity);
		
		List<NewsletterSection> dbResultNewsletter = newsletterSectionService.getResultWebsite();
		theModel.addAttribute("newslettersection", dbResultNewsletter);
		
		List<ResourceSection> dbResultResource = resourceSectionService.getResultWebsite();
		theModel.addAttribute("resourcesection", dbResultResource);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		return "index";
	}
	
	@RequestMapping("/admin/admindashboard/home_content")
	public String HomeContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Banner dbresultBanner=bannerService.getContent();
			theModel.addAttribute("banner", dbresultBanner);
			
			ConferenceSection dbresultConference=conferenceSectionService.getResultAdmin();
			theModel.addAttribute("conferencesection", dbresultConference); 
			
			JobSection dbresultJob=jobSectionService.getResultAdmin();
			theModel.addAttribute("jobsection", dbresultJob); 
			
			SpeakerSection dbresultSpeaker=speakerSectionService.getResultAdmin();
			theModel.addAttribute("speakersection", dbresultSpeaker); 
			
			BlogSection dbresultBlog=blogSectionService.getResultAdmin();
			theModel.addAttribute("blogsection", dbresultBlog); 
			
			PodcastSection dbresultPodcast=podcastSectionService.getResultAdmin();
			theModel.addAttribute("podcastsection", dbresultPodcast); 
			
			CommunitySection dbresultCommunity=communitySectionService.getResultAdmin();
			theModel.addAttribute("communitysection", dbresultCommunity); 
			
			NewsletterSection dbresultNewsletter=newsletterSectionService.getResultAdmin();
		    theModel.addAttribute("newslettersection", dbresultNewsletter); 
			
		    ResourceSection dbresultResource=resourceSectionService.getResultAdmin();
			theModel.addAttribute("resourcesection", dbresultResource); 
			
			return "admin/home_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/bannerupdate")
	public String BannerUpdate(@ModelAttribute("banner") Banner banner,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			banner.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(photo==null){
			List<Banner> result=bannerService.getImage(1);
			  for(Banner dbresult : result) {
				  image=dbresult.getImage();
		        }
			banner.setImage(image);
		}
		bannerService.bannerUpdate(banner.getImage(), banner.getTitle(), banner.getSubtitle(), banner.getStatus());
				
		return "redirect:/admin/admindashboard/home_content";
			
	}
	
	@PostMapping("/admin/admindashboard/conferencesectionupdate")
	public String ConferenceUpdate(@ModelAttribute("conferencesection") ConferenceSection conferenceSection,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			conferenceSection.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(photo==null){
			List<ConferenceSection> result=conferenceSectionService.getImage(1);
			  for(ConferenceSection dbresult : result) {
				  image=dbresult.getImage();
		        }
			  conferenceSection.setImage(image);
		}
		conferenceSectionService.conferenceSectionupdate(conferenceSection.getImage(), conferenceSection.getTitle(), conferenceSection.getSubtitle(), conferenceSection.getButtontextleft(),conferenceSection.getButtontextright(),conferenceSection.isStatus());
				
		return "redirect:/admin/admindashboard/home_content";
			
	}
	
	@PostMapping("/admin/admindashboard/jobsectionupdate")
	public String JobSectionUpdate(@ModelAttribute("jobsection") JobSection jobSection,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			jobSection.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(photo==null){
			List<JobSection> result=jobSectionService.getImage(1);
			  for(JobSection dbresult : result) {
				  image=dbresult.getImage();
		        }
			  jobSection.setImage(image);
		}
		jobSectionService.jobSectionUpdate(jobSection.getImage(), jobSection.getTitle(), jobSection.getSubtitle(), jobSection.getButtontextleft(),jobSection.getButtontextright(),jobSection.isStatus());
				
		return "redirect:/admin/admindashboard/home_content";
			
	}
	
	@PostMapping("/admin/admindashboard/speakersectionupdate")
	public String SpeakerSectionUpdate(@ModelAttribute("speakersection") SpeakerSection speakerSection,HttpServletRequest request) {
		
		speakerSectionService.speakerSectionUpdate(speakerSection.getTitle(), speakerSection.getButtontext(), speakerSection.isStatus());
				
		return "redirect:/admin/admindashboard/home_content";
			
	}
	
	@PostMapping("/admin/admindashboard/blogsectionupdate")
	public String BlogSectionUpdate(@ModelAttribute("blogsection") BlogSection blogSection,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			blogSection.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(photo==null){
			List<BlogSection> result=blogSectionService.getImage(1);
			  for(BlogSection dbresult : result) {
				  image=dbresult.getImage();
		        }
			  blogSection.setImage(image);
		}
		blogSectionService.blogSectionUpdate(blogSection.getImage(), blogSection.getTitle(), blogSection.getSubtitle(), blogSection.getButtontextleft(),blogSection.getButtontextright(),blogSection.isStatus());
				
		return "redirect:/admin/admindashboard/home_content";
			
	}
	
	@PostMapping("/admin/admindashboard/podcastsectionupdate")
	public String PodcastSectionUpdate(@ModelAttribute("podcastsection") PodcastSection podcastSection,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			podcastSection.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(photo==null){
			List<PodcastSection> result=podcastSectionService.getImage(1);
			  for(PodcastSection dbresult : result) {
				  image=dbresult.getImage();
		        }
			  podcastSection.setImage(image);
		}
		
		podcastSectionService.podcastSectionUpdate(podcastSection.getImage(), podcastSection.getTitle(), podcastSection.getSubtitle(), podcastSection.getButtontext(),podcastSection.isStatus());
				
		return "redirect:/admin/admindashboard/home_content";
			
	}
	
	@PostMapping("/admin/admindashboard/communitysectionupdate")
	public String CommunitySectionUpdate(@ModelAttribute("communitysection") CommunitySection communitySection,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			communitySection.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(photo==null){
			List<CommunitySection> result=communitySectionService.getImage(1);
			  for(CommunitySection dbresult : result) {
				  image=dbresult.getImage();
		        }
			  communitySection.setImage(image);
		}
		
		communitySectionService.communitySectionUpdate(communitySection.getImage(), communitySection.getTitle(), communitySection.getSubtitle(), communitySection.getButtontextleft(), communitySection.getButtontextright(),communitySection.isStatus());
				
		return "redirect:/admin/admindashboard/home_content";
			
	}
	
	@PostMapping("/admin/admindashboard/resourcesectionupdate")
	public String ResourceSectionUpdate(@ModelAttribute("resourcesection") ResourceSection resourceSection,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			resourceSection.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(photo==null){
			List<ResourceSection> result=resourceSectionService.getImage(1);
			  for(ResourceSection dbresult : result) {
				  image=dbresult.getImage();
		        }
			  resourceSection.setImage(image);
		}
		
		resourceSectionService.resourceSectionUpdate(resourceSection.getImage(), resourceSection.getTitle(), resourceSection.getSubtitle(), resourceSection.getButtontext(),resourceSection.isStatus());
				
		return "redirect:/admin/admindashboard/home_content";
			
	}
	
	@PostMapping("/admin/admindashboard/newslettersectionupdate")
	public String NewsletterSectionUpdate(@ModelAttribute("newslettersection") NewsletterSection newsletterSection,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			newsletterSection.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(photo==null){
			List<NewsletterSection> result=newsletterSectionService.getImage(1);
			  for(NewsletterSection dbresult : result) {
				  image=dbresult.getImage();
		        }
			  newsletterSection.setImage(image);
		}
		
		newsletterSectionService.newsletterSectionUpdate(newsletterSection.getImage(), newsletterSection.getTitle(), newsletterSection.isStatus());
				
		return "redirect:/admin/admindashboard/home_content";
			
	}
	
}
