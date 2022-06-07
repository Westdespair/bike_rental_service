package no.ntnu.bikerental.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Column;

@Controller
public class ShoppingCartController {

    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/shopping-cart")
    public String getShoppingCart(Model model){
        return "HTML/Shopping-Cart";
    }
}
