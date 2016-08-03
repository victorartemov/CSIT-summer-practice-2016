package com.epam.sproject.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author Vadim Shvedov
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	SocialNetworksAuth socialNetworksAuth;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		//provide access for all to use "/", "/login**", "/webjars/**"
		//URLes have access temporary: /editor, /saveFragment, /show
		http.antMatcher("/**")
				.authorizeRequests()
				.antMatchers( "/"
						    , "/login**"
						    //, "/views/auth/**"
						    , "/views/**"
						    , "/api/**"
						    , "/signup**"
						    , "/webjars/**"
						    , "/static/js/**"
						    , "/show").permitAll()
				.anyRequest().authenticated()
				.and().addFilterAfter(socialNetworksAuth.oAuth2ClientContextFilter(), AbstractPreAuthenticatedProcessingFilter.class)
				.addFilterBefore(socialNetworksAuth.ssoFilters(), BasicAuthenticationFilter.class);

		//trying to clear SESSION cookies, but it doesn't work
		http.logout()
				.logoutSuccessHandler(new CustomLogoutSuccessHandler())
				.invalidateHttpSession(true)
				.deleteCookies("JSESSIONID")
				.permitAll();

		//init custom login page
		http.formLogin().loginPage("/login").permitAll();


	}




	public class CustomLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {
		@Override
		public void onLogoutSuccess(HttpServletRequest request,
									HttpServletResponse response, Authentication authentication)
				throws IOException, ServletException {

			authentication.setAuthenticated(false);
			super.onLogoutSuccess(request, response, authentication);
		}
	}

}
