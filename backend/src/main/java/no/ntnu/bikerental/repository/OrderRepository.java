package no.ntnu.bikerental.repository;

import no.ntnu.bikerental.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CustomerOrder, Integer> {
}
