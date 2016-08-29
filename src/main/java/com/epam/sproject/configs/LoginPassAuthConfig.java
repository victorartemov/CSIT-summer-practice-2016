package com.epam.sproject.configs;


import com.epam.sproject.model.entity.User;
import com.epam.sproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Custom Login - Pass authorization
 * @author Vadim Shvedov
 */
@Configuration
public class LoginPassAuthConfig extends GlobalAuthenticationConfigurerAdapter {

    @Autowired
    UserService userService;

    @Override
    public void init(AuthenticationManagerBuilder auth) {

        auth.authenticationProvider(new AuthenticationProvider() {
            @Override
            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
                String login = authentication.getName();
                String password = authentication.getCredentials().toString();
                //check login/pass and try to get User information
                User user = null;
                try {
                    user = userService.getUserBylogin(login);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (user != null && user.getPassword().compareTo(password) == 0) {
                    List<GrantedAuthority> grantedAuths = new ArrayList<>();
                    grantedAuths.add(new SimpleGrantedAuthority("user"));
                    //push user information as a Principal
                    return new UsernamePasswordAuthenticationToken(user.toUserView(), password, grantedAuths);
                } else {
                    return null;
                }
            }

            @Override
            public boolean supports(Class<?> authentication) {
                return authentication.equals(UsernamePasswordAuthenticationToken.class);
            }
        });
    }
}