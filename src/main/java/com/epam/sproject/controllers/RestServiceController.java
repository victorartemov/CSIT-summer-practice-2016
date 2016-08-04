package com.epam.sproject.controllers;

import com.epam.sproject.model.entity.Fragment;
import com.epam.sproject.model.entity.Story;
import com.epam.sproject.services.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashSet;


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


    @RequestMapping(value = "/api/addChildFragment", method = RequestMethod.POST)
    public Fragment addChildFragment(@RequestParam(value = "id_fragment", defaultValue = "0") int id_fragment,
                                  @RequestBody Fragment fragment) {
        Fragment newFragment = new Fragment();
        newFragment.setChildFragments(new HashSet<>());
        newFragment.setText(fragment.getText());
        newFragment.setTitle(fragment.getTitle());
        newFragment.setLikes(new HashSet<>());
        return newFragment;
    }

    @RequestMapping(value = "/api/getAllStory", method = RequestMethod.GET)
    public ArrayList<Story> getAllStory() {
        return (ArrayList<Story>)storyService.getAllStories();
    }
}
