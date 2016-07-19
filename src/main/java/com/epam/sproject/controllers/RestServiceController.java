package com.epam.sproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;


/**
 * Rest API Example
 * @author Vadim
 */
@RestServiceController
public class RestServiceController {

    //Simple Get User Information (It's need to recode!!!)
    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;

    }

}
