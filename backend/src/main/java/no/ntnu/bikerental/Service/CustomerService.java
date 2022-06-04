package no.ntnu.bikerental.Service;

import no.ntnu.bikerental.Model.Customer;
import no.ntnu.bikerental.Repository.CustomerRepository;
import no.ntnu.bikerental.Model.CustomerOrder;
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
