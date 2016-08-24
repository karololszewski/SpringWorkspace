package masterSpringMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TweetController {
	@Autowired
	private Twitter twitter;
	@RequestMapping("/")
	public String hello(@RequestParam(defaultValue = "SpringMvc4") String search, Model model) {
//		SearchResults searchResults = twitter.searchOperations().search(search);
//		String text = searchResults.getTweets().get(0).getText();
//		model.addAttribute("message", text);
//		return "pageResult";
		
//		SearchResults searchResults = twitter.searchOperations().search(search);
//		List<String> tweets = searchResults.getTweets().stream().map(Tweet::getText).collect(Collectors.toList());
//		model.addAttribute("tweets", tweets);
//		return "pageResult";
		
		SearchResults searchResults = twitter.searchOperations().search(search);
		List<Tweet> tweets = searchResults.getTweets();
		model.addAttribute("tweets", tweets);
		model.addAttribute("search", search);
		return "pageResult";
	}
}
