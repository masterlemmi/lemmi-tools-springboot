package com.lemzki.tools.security;

import com.lemzki.tools.security.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.stereotype.Component;

/**
 * Saves the Authenticated SSO User to the DB
 */
@Component
public class AuthenticationSuccessListener implements ApplicationListener<AuthenticationSuccessEvent> {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @Autowired
    private UserDetailsService userDetailsService;


    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        Authentication auth = event.getAuthentication();

        if (auth instanceof OAuth2Authentication) {

//            OAuth2Authentication oauth2 = (OAuth2Authentication) auth;
//
//            User user = UserMapper.mapFrom(oauth2);
//
//            userService.findByGoogleId(user.getGoogleId())
//                    .ifPresent(optUser ->
//                            user.setId(optUser.getId()));

//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//            if (authentication == null){
//                return null;
//            }
//            String token = ((OAuth2AuthenticationDetails) authentication.getDetails()).getTokenValue();

//
//            userService.save(user);
            System.out.println("HERE");


        } else {
            log.warn("User authenticated by a non OAuth2 mechanism. Class is " + auth.getClass());
        }

    }


}