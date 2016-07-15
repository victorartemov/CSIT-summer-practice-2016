package com.epam.sproject.restExample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


/**
 * Rest API Example
 * @author Vadim
 */
@RestController
public class RestAPI {

    //Simple Get User Information (It's need to recode!!!)
    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;

    }

}
