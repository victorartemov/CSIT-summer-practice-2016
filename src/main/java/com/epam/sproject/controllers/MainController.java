package com.epam.sproject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;


/**
 * Some mapping examples
 */
@Controller
public class MainController {

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
	public ModelAndView welcomePage() {
		ModelAndView model = new ModelAndView();
		model.addObject("message", "Hello World!");
		model.setViewName("index");
		return model;
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
