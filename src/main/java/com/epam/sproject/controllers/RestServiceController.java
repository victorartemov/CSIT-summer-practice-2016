package com.epam.sproject.controllers;

import com.epam.sproject.model.entity.Story;
import com.epam.sproject.services.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


/**
 * Rest API Example
 * @author Vadim
 */
@RestController
public class RestServiceController {


    @Autowired
    StoryService storyService;
    //Simple Get User Information (It's need to recode!!!)
    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;

    }

    @RequestMapping(value = "/api/getFamousStory", method = RequestMethod.GET)
    public Story getFamousStory() {
        return storyService.getBestStory();
    }
}
