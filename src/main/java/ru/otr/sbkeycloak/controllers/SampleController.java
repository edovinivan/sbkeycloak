package ru.otr.sbkeycloak.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {
    @GetMapping("/anonymous")
    public String getAnonymousInfo() {
        return "Anonymous";
    }

    @GetMapping("/user")
    public String getUserInfo() {
        return "user info";
    }

    @GetMapping("/admin")
    public String getAdminInfo() {
        return "admin info";
    }

    @GetMapping("/service")
    public String getServiceInfo() {
        return "service info";
    }

    @GetMapping("/me")

    public Object getMe() {

        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        return principal;
        //return authentication.getName();
    }
}
