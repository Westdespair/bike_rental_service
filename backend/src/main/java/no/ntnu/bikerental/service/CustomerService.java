package no.ntnu.bikerental.service;

import no.ntnu.bikerental.model.Customer;
import no.ntnu.bikerental.repository.CustomersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private CustomersRepository customersRepository;

    public CustomerService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public List<Customer> getAllCustomer() {
        return (List<Customer>) customersRepository.findAll();
    }

    public Customer findCustomerById(long ID) {
        Optional<Customer> customer = customersRepository.findById(ID);
        return customer.get();

    }


}
