package com.epam.sproject.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.filter.OAuth2ClientAuthenticationProcessingFilter;
import org.springframework.security.oauth2.client.filter.OAuth2ClientContextFilter;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.filter.CompositeFilter;

import javax.servlet.Filter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vadim
 */

@Configuration
@EnableOAuth2Client
public class SocialNetworksAuth {

    @Autowired
    OAuth2ClientContext oauth2ClientContext;

    @Bean
    public OAuth2ClientContextFilter oAuth2ClientContextFilter() {
        return new OAuth2ClientContextFilter();
    }


    public Filter ssoFilters() {
        CompositeFilter filter = new CompositeFilter();
        List<Filter> filters = new ArrayList<>();

        filters.add(ssoFilter(facebookResource(), "https://graph.facebook.com/me", "/login/facebook"));
        filters.add(ssoFilter(gitHubResource(), "https://api.github.com/user", "/login/github"));
        filters.add(ssoFilter(vkResource(), "https://api.vk.com/method/users.get?", "/login/vk"));

        filter.setFilters(filters);
        return filter;
    }

    private Filter ssoFilter(AuthorizationCodeResourceDetails resourceDetails, String userInfoEndpointUrl, String loginURI) {

        OAuth2ClientAuthenticationProcessingFilter socialFilter = new OAuth2ClientAuthenticationProcessingFilter(loginURI);
        OAuth2RestTemplate socialTemplate = new OAuth2RestTemplate(resourceDetails, oauth2ClientContext);
        socialFilter.setRestTemplate(socialTemplate);

        ResourceTokenService services = new ResourceTokenService(userInfoEndpointUrl, resourceDetails.getClientId());
        services.setRestTemplate(socialTemplate);
        services.setTokenType(resourceDetails.getTokenName());

        socialFilter.setTokenServices(services);
        return socialFilter;
    }

    private AuthorizationCodeResourceDetails facebookResource(){
        AuthorizationCodeResourceDetails facebookResourse = new AuthorizationCodeResourceDetails();
        facebookResourse.setClientId("233668646673605");
        facebookResourse.setClientSecret( "33b17e044ee6a4fa383f46ec6e28ea1d");
        facebookResourse.setAccessTokenUri("https://graph.facebook.com/oauth/access_token");
        facebookResourse.setUserAuthorizationUri("https://www.facebook.com/dialog/oauth");
        facebookResourse.setTokenName("oauth_token");
        facebookResourse.setClientAuthenticationScheme(AuthenticationScheme.form);
        facebookResourse.setAuthenticationScheme(AuthenticationScheme.query);
        return facebookResourse;
    }

    private AuthorizationCodeResourceDetails gitHubResource(){
        AuthorizationCodeResourceDetails gitHubResource = new AuthorizationCodeResourceDetails();
        gitHubResource.setClientId("bd1c0a783ccdd1c9b9e4");
        gitHubResource.setClientSecret("1a9030fbca47a5b2c28e92f19050bb77824b5ad1");
        gitHubResource.setAccessTokenUri("https://github.com/login/oauth/access_token");
        gitHubResource.setUserAuthorizationUri("https://github.com/login/oauth/authorize");
        gitHubResource.setTokenName("access_token");
        gitHubResource.setGrantType("authorization_code");
        gitHubResource.setClientAuthenticationScheme(AuthenticationScheme.form);
        gitHubResource.setAuthenticationScheme(AuthenticationScheme.header);
        gitHubResource.setUseCurrentUri(true);

        return gitHubResource;
    }

    private AuthorizationCodeResourceDetails vkResource(){
        AuthorizationCodeResourceDetails vkResource = new AuthorizationCodeResourceDetails();
        vkResource.setClientId("5534582");
        vkResource.setClientSecret("wKMIctloYusMaSVsbtTj");
        vkResource.setAccessTokenUri("https://oauth.vk.com/access_token");
        vkResource.setUserAuthorizationUri("https://oauth.vk.com/authorize");
        vkResource.setTokenName("access_token");
        vkResource.setGrantType("authorization_code");
        vkResource.setClientAuthenticationScheme(AuthenticationScheme.form);
        vkResource.setAuthenticationScheme(AuthenticationScheme.query);
        vkResource.setUseCurrentUri(true);

        return vkResource;
    }
}

