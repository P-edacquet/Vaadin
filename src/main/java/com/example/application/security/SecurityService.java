package com.example.application.security;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.server.VaadinServletRequest;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Component;

@Component
public class SecurityService {

    public void loggout(){
        UI.getCurrent().getPage().setLocation("/");
        SecurityContextLogoutHandler lougoutHandler = new SecurityContextLogoutHandler();
        lougoutHandler.logout(VaadinServletRequest.getCurrent().getHttpServletRequest(),null, null);
    }
}
