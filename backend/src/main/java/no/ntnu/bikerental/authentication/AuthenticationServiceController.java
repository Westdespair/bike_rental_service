package no.ntnu.bikerental.authentication;

import no.ntnu.bicycle.model.Customer;
import no.ntnu.bicycle.repository.CustomerRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Provides AccessUserDetails needed for authentication
 */
@Service
public class AuthenticationDetailsController implements UserDetailsService {

    private CustomerRepository customerRepository;

    /**
     * Constructor with the parameter customer repository
     * @param customerRepository customer repository
     */
    public AccessUserService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Loads user by username
     * @param email String.
     * @return user by username, otherwise throw an exception
     * @throws UsernameNotFoundException with customer email not found
     */
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Customer> customer = customerRepository.findByEmail(email);
        if (customer.isPresent()) {
            return new AccessUserDetails(customer.get());
        } else {
            throw new UsernameNotFoundException("Customer " + email + " not found");
        }
    }
}