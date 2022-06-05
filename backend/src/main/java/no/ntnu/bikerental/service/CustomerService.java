package no.ntnu.bikerental.service;

import no.ntnu.bikerental.model.Customer;
import no.ntnu.bikerental.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomer() {
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer findCustomerById(long ID) {
        Optional<Customer> customer = customerRepository.findById(ID);
        return customer.get();

    }


}
