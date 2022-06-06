package no.ntnu.bikerental.customer.order;

import no.ntnu.bikerental.customer.order.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
