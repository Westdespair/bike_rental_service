package no.ntnu.bikerental.repository;

import no.ntnu.bikerental.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
