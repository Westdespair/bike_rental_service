package no.ntnu.bikerental.repository;

import no.ntnu.bikerental.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
}
