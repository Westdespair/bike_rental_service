package no.ntnu.bikerental.authentication;

import no.ntnu.bikerental.service.CustomerService;
import no.ntnu.bikerental.model.Customers;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



/**
 * Provides AccessUserDetails needed for authentication
 */
@Service
public class AuthenticationService implements UserDetailsService {


    private CustomerService customerService;


    /**
     * Constructor with the parameter customer repository
     * @param customerService customer repository
     */
    public AuthenticationService(CustomerService customerService) {
        this.customerService = customerService;
    }


    /**
     * Loads user by username
     * @param email String.
     * @return user by username, otherwise throw an exception
     * @throws UsernameNotFoundException with customer email not found
     */

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Customers customers = customerService.findCustomerByEmail(email);
        return new AuthenticationDetails(customers);
        /*
        if (customers.isPresent()) {
            return new AuthenticationDetails(customers.get());
        } else {
            throw new UsernameNotFoundException("Customer " + email + " not found");
        }


         */
    }
}