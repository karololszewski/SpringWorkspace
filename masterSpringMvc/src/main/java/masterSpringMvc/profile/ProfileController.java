package masterSpringMvc.profile;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import masterSpringMvc.USLocalDateFormatter.USLocalDateFormatter;

@Controller
public class ProfileController {
	
	@RequestMapping("/profile")
	public String displayProfile(ProfileForm profileForm) {
		return "profile/profilePage";
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public String saveProfile(ProfileForm profileForm) {
		System.out.println("pomyslnie zapisano profil" + profileForm);
		return "redirect:/profile";
	}
	
	@ModelAttribute("dateFormat")
	public String localeFormat(Locale locale) {
		return USLocalDateFormatter.getPattern(locale);
	}
}
