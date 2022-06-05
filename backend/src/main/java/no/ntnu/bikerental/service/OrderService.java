package no.ntnu.bikerental.service;

import no.ntnu.bikerental.model.Orders;
import no.ntnu.bikerental.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class OrderService {
@Autowired
    private OrderRepository orderRepository;


    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Orders> iterableToList(Iterable<Orders> iterable){
        List<Orders> list = new LinkedList<>();
        iterable.forEach(list::add);
        return list;
    }

    public List<Orders> getAll(){
        return iterableToList(orderRepository.findAll());
    }


}
