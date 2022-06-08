package no.ntnu.bikerental.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("ProductMapping")
public class ProductController {

    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/products-manualorelectric")
    public String getProduct(Model model){
        return "manual-or-electric";
    }


    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/product-color")
    public String getColorChoices(Model model){
        return "product-color";
    }

    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/anything-else")
    public String getAnythingElse(Model model){
        return "product-choices";
    }
}
