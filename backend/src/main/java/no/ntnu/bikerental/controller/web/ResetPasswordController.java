package no.ntnu.bikerental.controller.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ResetPasswordController {


    /**
     *
     * @return
     */
    @GetMapping("/reset-password")
        public ResponseEntity<String> getResetPassword(){
            ResponseEntity<String> response;
            response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
            return response;
        }
    }

