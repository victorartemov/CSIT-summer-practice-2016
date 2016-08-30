package com.epam.sproject.controllers;

import com.epam.sproject.model.entity.*;
import com.epam.sproject.services.StoryService;
import com.epam.sproject.services.UserService;
import com.epam.sproject.services.impl.StoryServiceImpl;
import com.epam.sproject.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Rest API Example
 *
 * @author Vadim
 */
@RestController
public class RestServiceController {

    @Autowired
    StoryServiceImpl storyService;
    
    @Autowired
    UserServiceImpl userService; 

    //Simple Get User Information (It's need to recode!!!)
    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public RequestStatus signUp(Principal principal, @RequestBody User user) {
        try {

            userService.registerNewUser(user);
            
            return new RequestStatus(0);
        } catch (Exception e) {
            return new RequestStatus(400);
        }
    }

    @RequestMapping(value = "/api/getFamousStory", method = RequestMethod.GET)
    public Story getFamousStory() {
        return storyService.getBestStory();
    }

    @RequestMapping(value = "/api/addChildFragment", method = RequestMethod.POST)
    public Fragment addChildFragment(@RequestParam(value = "id_fragment", defaultValue = "0") int id_fragment,
            @RequestBody Fragment fragment) {

        return fragment;
    }

    @RequestMapping(value = "/api/getAllStory", method = RequestMethod.GET)
    public ArrayList<Story> getAllStory() {
        return (ArrayList<Story>) storyService.getAllStories();
    }
}
