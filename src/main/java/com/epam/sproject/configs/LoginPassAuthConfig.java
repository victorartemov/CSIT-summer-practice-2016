package com.epam.sproject.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Custom Login - Pass authorization
 * @author Vadim Shvedov
 */
@Configuration
public class LoginPassAuthConfig extends GlobalAuthenticationConfigurerAdapter {

    @Override
    public void init(AuthenticationManagerBuilder auth) {

        //here would be @Autowired Database
        //DATABASE - our current database =)

        Map<String, String> DATABASE = new HashMap<>();
        DATABASE.put("user1", "pass1");
        DATABASE.put("user2", "pass2");
        DATABASE.put("user3", "pass3");
        DATABASE.put("user4", "pass4");
        DATABASE.put("user5", "pass5");

        auth.authenticationProvider(new AuthenticationProvider() {
            @Override
            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
                String login = authentication.getName();
                String password = authentication.getCredentials().toString();

                //check user from database
                if (DATABASE.containsKey(login) && DATABASE.get(login).compareTo(password) == 0) {
                    List<GrantedAuthority> grantedAuths = new ArrayList<>();
                    grantedAuths.add(new SimpleGrantedAuthority("User"));
                    return new UsernamePasswordAuthenticationToken(login, password, grantedAuths);
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