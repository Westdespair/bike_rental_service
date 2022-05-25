package no.ntnu.bikerental.Repository;

import no.ntnu.bikerental.Model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CustomerOrder, Integer> {
}
