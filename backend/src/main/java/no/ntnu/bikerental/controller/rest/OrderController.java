package no.ntnu.bikerental.controller.rest;

import no.ntnu.bikerental.service.BikeService;
import no.ntnu.bikerental.service.CustomerService;
import no.ntnu.bikerental.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService orderService;
    private CustomerService customerService;
    private BikeService bikeService;


    /**
     * @param orderService
     * @param customerService
     * @param bikeService
     */
    public OrderController(OrderService orderService, CustomerService customerService, BikeService bikeService) {
        this.orderService = orderService;
        this.customerService = customerService;
        this.bikeService = bikeService;
    }

}


