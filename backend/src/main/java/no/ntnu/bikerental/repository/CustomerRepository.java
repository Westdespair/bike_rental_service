package no.ntnu.bikerental.repository;

import no.ntnu.bikerental.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {


}

