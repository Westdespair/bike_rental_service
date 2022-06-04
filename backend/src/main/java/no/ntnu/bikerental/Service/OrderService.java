package no.ntnu.bikerental.Service;

import no.ntnu.bikerental.Model.CustomerOrder;
import no.ntnu.bikerental.Repository.OrderRepository;
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

    public List<CustomerOrder> iterableToList(Iterable<CustomerOrder> iterable){
        List<CustomerOrder> list = new LinkedList<>();
        iterable.forEach(list::add);
        return list;
    }

    public List<CustomerOrder> getAll(){
        return iterableToList(orderRepository.findAll());
    }


}
