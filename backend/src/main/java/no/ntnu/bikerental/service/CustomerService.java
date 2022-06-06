package no.ntnu.bikerental.service;

import no.ntnu.bikerental.model.Customers;
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

    public List<Customers> getAllCustomer() {
        return (List<Customers>) customersRepository.findAll();
    }

    public Customers findCustomerById(long ID) {
        Optional<Customers> customer = customersRepository.findById(ID);
        return customer.get();

    }

    public String addNewCustomer(Customers customers) {
        boolean added = false;
        if (customers != null && customers.isValid()) {
            try {
                findCustomerById(customers.getCustomerID());

            }
        }


    }
}
