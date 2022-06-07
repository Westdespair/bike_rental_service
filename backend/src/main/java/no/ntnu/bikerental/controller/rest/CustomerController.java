package no.ntnu.bikerental.controller.rest;

import no.ntnu.bikerental.service.CustomerService;
import no.ntnu.bikerental.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
    private final CustomerService customerService;
    private final ProductService productService;

    public CustomerController(CustomerService customerService, ProductService productService){
        this.customerService = customerService;
        this.productService = productService;
    }

}
