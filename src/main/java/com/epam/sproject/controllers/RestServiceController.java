package com.epam.sproject.controllers;

import com.epam.sproject.model.entity.*;
import com.epam.sproject.services.StoryService;
import com.epam.sproject.services.UserService;
import com.epam.sproject.services.impl.FragmentServiceImpl;
import com.epam.sproject.services.impl.StoryServiceImpl;
import com.epam.sproject.services.impl.UserServiceImpl;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    @Autowired
    FragmentServiceImpl fragmentService;

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

    @RequestMapping(value = "/api/addChildFragment", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public RequestStatus addChildFragment(@RequestParam(value = "id_fragment", defaultValue = "0") int id_fragment,
            @RequestBody Fragment fragment) {
        
        Fragment parentFragment;

        try {
            parentFragment = fragmentService.getFragmentById((long) 1);

            if (parentFragment.getChildFragments().size() < 3) {
                parentFragment.getChildFragments().add(fragment);
            } else {
                return new RequestStatus(500);
            }

            fragmentService.saveFragment(fragment);
            fragmentService.updateFragment(parentFragment);

        } catch (IOException ex) {
            return new RequestStatus(500);
        }
        
        return new RequestStatus(0);

    }

    @RequestMapping(value = "/api/getAllStory", method = RequestMethod.GET)
    public ArrayList<Story> getAllStory() {
        return (ArrayList<Story>) storyService.getAllStories();
    }
}
