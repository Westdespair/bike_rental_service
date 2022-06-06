package no.ntnu.bikerental.customer;

import no.ntnu.bikerental.customer.Customers;
import no.ntnu.bikerental.customer.CustomersRepository;
import no.ntnu.bikerental.customer.Customers;
import no.ntnu.bikerental.model.Role;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CustomerService {

    private CustomersRepository customersRepository;

    /**
     * @param customersRepository
     */
    public CustomerService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    /**
     * @return
     */
    public List<Customers> getAllCustomer() {
        return (List<Customers>) customersRepository.findAll();
    }

    /**
     * @param ID
     * @return
     */
    public Customers findCustomerById(long ID) {
        Optional<Customers> customer = customersRepository.findById(ID);
        return customer.get();

    }

    /**
     * @param email
     * @return
     */
    public Customers findCustomerByEmail(String email) {
        Optional<Customers> customers = customersRepository.findByEmail(email);
        return customers.get();
    }

    /**
     * @param customers
     * @return
     */
    public boolean addCustomer(Customers customers) {
        boolean added = false;
        if (customers != null && customers.isValid()) {
            try {
                findCustomerById(customers.getCustomerID());

            } catch (NoSuchElementException e) {
                customers.setPassword(new BCryptPasswordEncoder().encode(customers.getPassword()));
                customers.setRole(Role.ROLE_USER);
                customersRepository.save(customers);
                added = true;
            }
        }
        return added;

    }

    /**
     * Delete a customer
     *
     * @param
     * @return
     */
    public boolean deleteCustomer(int customerID) {
        String errorMessage = null;

        Optional<Customers> customers = customersRepository.findById((long) customerID);

        if (customers == null) {
            errorMessage = "Customer with " + customerID + " not found.";
        }

        if(errorMessage == null){
            customers.ifPresent(value -> customersRepository.delete(value));
        }

        return customers.isPresent();
    }

    /**
     *
     * @param customerID
     * @param customers
     * @return
     */
    public String updateCustomer(long customerID, Customers customers) {
        String errorMessage = null;
        Customers existingCustomer = findCustomerById(customerID);
        if (existingCustomer == null) {
            errorMessage = "No customer with ID " + customerID + "exists";
        }else if(customers == null || !customers.isValid()) {
            errorMessage = "invalid data";
        }else if(customers.getCustomerID() != customerID){
            errorMessage = "The ID do not match";
        }

        if(errorMessage == null){
            customersRepository.save(customers);
        }

        return errorMessage;
    }

    /**
     *
     * @param email
     * @return
     */
    public String resetPassword(String email){
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        CharacterRule alphabets = new CharacterRule(EnglishCharacterData.Alphabetical);
        CharacterRule digits = new CharacterRule(EnglishCharacterData.Digit);
        String generatedPassword = passwordGenerator.generatePassword(8, alphabets, digits);
        Optional<Customers> customers = customersRepository.findByEmail(email);
        if (customers.isPresent()) {
            customers.get().setPassword(new BCryptPasswordEncoder().encode(generatedPassword));
            updateCustomer(customers.get().getCustomerID(), customers.get());
        }else{
            generatedPassword = null;
        }
        return generatedPassword;
    }
}





