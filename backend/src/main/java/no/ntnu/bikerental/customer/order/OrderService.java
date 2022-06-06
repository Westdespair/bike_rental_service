package no.ntnu.bikerental.customer.order;

import no.ntnu.bikerental.customer.order.Orders;
import no.ntnu.bikerental.customer.order.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class OrderService {
@Autowired
    private OrdersRepository ordersRepository;


    public OrderService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Orders> iterableToList(Iterable<Orders> iterable){
        List<Orders> list = new LinkedList<>();
        iterable.forEach(list::add);
        return list;
    }

    public List<Orders> getAll(){
        return iterableToList(ordersRepository.findAll());
    }


}
