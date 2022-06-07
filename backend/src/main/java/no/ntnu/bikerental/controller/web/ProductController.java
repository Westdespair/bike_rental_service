package no.ntnu.bikerental.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/products-choises")
    public String getProduct(Model model){
        return "HTML/ProductChoices";
    }


    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/product-color")
    public String getColorChoises(Model model){
        return "HTML/ProductColor";
    }

    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/anything-else")
    public String getAnythingElse(Model model){
        return "HTML/AnythingElse";
    }
}
