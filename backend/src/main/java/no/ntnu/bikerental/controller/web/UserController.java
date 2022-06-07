package no.ntnu.bikerental.controller.web;

import no.ntnu.bikerental.model.Customers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class UserController {
    Customers customer = new Customers();



    @GetMapping("/account")
    public String getAccount(Model model) {
            return "HTML/Account";
    }

    /**
     * Respond to HTTP get
     * @return account address
     */
    @GetMapping("account/address")
    public String getAccountAddress(){
        return "HTML/Account-address";
    }

    /**
     *
     * @return
     */
    @GetMapping("account/orders")
    public String getAccountOrders(){
        return "HTML/Account-orders";
    }

    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/admin")
    public String getLoginSuccessAdmin(Model model) {
        return "HTML/Admin-users";
    }

    /**
     *
     * @return
     */
    @GetMapping("account/all-products")
    public String getProducts() {
        return "HTML/Admin-products";
    }

    /**
     *
     * @return
     */
    @GetMapping("account/all-orders")
    public String getOrders() {
        return "HTML/Admin-orders";
    }

    /**
     *
     * @return
     */
    @GetMapping("account/all-bikes")
    public String getBikes() {
        return "HTML/Admin-bikes";
    }
}
