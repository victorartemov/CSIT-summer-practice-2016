package com.epam.sproject.controllers;


import com.epam.sproject.model.entity.Fragment;
import com.epam.sproject.model.entity.Story;
import com.epam.sproject.services.FragmentService;
import com.epam.sproject.services.StoryService;
import com.epam.sproject.services.UserService;
import com.epam.sproject.services.impl.FragmentServiceImpl;
import com.epam.sproject.services.impl.StoryServiceImpl;
import com.epam.sproject.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;


/**
 * Some mapping examples
 */
@Controller
public class MainController {

	//Constructors are temporally here
	//@Autowired
	private FragmentService fragmentService=new FragmentServiceImpl();

	//@Autowired
	private StoryService storyService=new StoryServiceImpl();

	//@Autowired
	private UserService userService=new UserServiceImpl();

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String redirect(HttpServletRequest request, HttpServletResponse response) {

		Cookie[] allCookies = request.getCookies();

		for (int i = 0; i < allCookies.length; i++) {
			String name = allCookies[i].getName();
			if (name.equalsIgnoreCase("JSESSIONID")) {
				Cookie cookieToDelete = allCookies[i];
				cookieToDelete.setValue("");
				cookieToDelete.setMaxAge(0);
				cookieToDelete.setVersion(0);
				cookieToDelete.setPath("/");
				response.addCookie(cookieToDelete);
			}

		}
		return "login";
	}

	@RequestMapping(value = "/", method = {RequestMethod.GET})
	public String welcomePage(ModelMap model) throws IOException {
		Story bestStory=new Story();
		//storyService.getBestStory();
		model.addAttribute("bestStory", bestStory);
		return "index";
	}

	@RequestMapping(value="/index/singleFragment", method={RequestMethod.GET})
	public String getSingleFragment(ModelMap model) throws IOException {
		long chosenFragmentId=(long)model.get("chosenFragmentId");
		Fragment chosenFragment=new Fragment();
		//fragmentService.getFragmentById(chosenFragmentId);
		model.addAttribute("chosenFragment", chosenFragment);
		return "redirect:index";
	}

	@RequestMapping(value="/index/saveFragment", method={RequestMethod.POST})
	public String saveFragment(ModelMap model) throws IOException {
		Fragment newFragment=(Fragment)model.get("newFragment");
		fragmentService.saveFragment(newFragment);
		return "redirect:index";
	}

	@RequestMapping(value = "/protected**", method = RequestMethod.GET)
	public ModelAndView protectedPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("message", "Page One!");
		model.setViewName("pageview");
		return model;

	}

	@RequestMapping(value = "/confidential**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("message", "Page Two!");
		model.setViewName("pageview");

		return model;

	}
}
