package com.epam.sproject.controllers;


import com.epam.sproject.model.entity.Fragment;
import com.epam.sproject.model.entity.Story;
import com.epam.sproject.services.FragmentService;
import com.epam.sproject.services.StoryService;
import com.epam.sproject.services.UserService;
import com.epam.sproject.services.impl.FragmentServiceImpl;
import com.epam.sproject.services.impl.StoryServiceImpl;
import com.epam.sproject.services.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;


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


	@RequestMapping(value = "/", method = {RequestMethod.GET})
	public String welcomePage(ModelMap model) throws IOException {
		Story bestStory=new Story();
		//storyService.getBestStory();
		model.addAttribute("bestStory", bestStory);
		return "index";
	}

	@RequestMapping(value="/collections", method={RequestMethod.GET})
	public String getCollections(ModelMap model) throws IOException {
		Collection<Story> listStories=storyService.getAllStories();
		model.addAttribute("collection",listStories);
		return "collections";
	}

	@RequestMapping(value="/singleFragment", method={RequestMethod.GET})
	public String getSingleFragment(ModelMap model) throws IOException {
		long chosenFragmentId=(long)model.get("chosenFragmentId");
		Fragment chosenFragment=new Fragment();
		//fragmentService.getFragmentById(chosenFragmentId);
		model.addAttribute("chosenFragment", chosenFragment);
		return "redirect:/";
	}

	@RequestMapping(value="/editor", method={RequestMethod.GET})
	public String getEditor(ModelMap model) throws IOException {
		Fragment fragment=new Fragment();
		model.addAttribute("fragment", fragment);
		return "editor";
	}

	@RequestMapping(value="/editor", method={RequestMethod.POST})
	public String saveFragment(HttpServletRequest request, Fragment fragment, ModelMap model) throws IOException {
		String titleChild1=request.getParameter("text1");
		String titleChild2=request.getParameter("text2");
		String titleChild3=request.getParameter("text3");

		Fragment child1=new Fragment();
		Fragment child2=new Fragment();
		Fragment child3=new Fragment();

		child1.setParent(fragment);
		child2.setParent(fragment);
		child3.setParent(fragment);

		child1.setTitle(titleChild1);
		child2.setTitle(titleChild2);
		child3.setTitle(titleChild3);

		/*Set<Fragment>children=new TreeSet<Fragment>();
		children.add(child1);
		children.add(child2);
		children.add(child3);
		fragment.setChildFragments(children);
		fragmentService.saveFragment(fragment);*/
		return "redirect:/";
	}
}
