package no.ntnu.bikerental.controller.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * This is a REST API controller - part of the backend
 */

@Controller
public class LoginController {
    /**
     * Responds to HTTP get /
     *
     * @return Name of the template to render
     */
    @GetMapping("/login")
    public String getLogin(Model model) {

        return "HTML/login";
    }

    @GetMapping("/loginOk")
    //or hasRole('ADMIN'
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String getSuccessfulLoginURL(Authentication authentication) {
        System.out.println(authentication);
        if (authentication != null) {
            authentication.getAuthorities().forEach(auth -> System.out.println(auth));
        }
        return "HTML/loginSuccessUser";
    }

}