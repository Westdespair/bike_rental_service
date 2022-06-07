package no.ntnu.bikerental.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;

@Controller
public class RentalController {

    /**
     *
     * @return
     */
    @GetMapping("/rental")
    public String getRentalWeb(){
        return "HTML/BikeRental";
    }

    /**
     *
     * @param bicycleId
     * @param model
     * @return
     */
    @GetMapping("/rental/confirmation/{id}")
    public String getRentalConfirmationWeb(@PathParam("bicycle") @PathVariable("id") int bicycleId, Model model){
        return "HTML/RentalConfirmation";
    }
}
