package no.ntnu.bikerental.authentication;

import no.ntnu.bikerental.customer.Customers;
import no.ntnu.bikerental.model.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Containing authentication information, needed by UserDetailsService
 */
public class AuthenticationDetails implements UserDetails {
    private final String username;
    private final String password;
    private final List<GrantedAuthority> authorities = new LinkedList<>();

    /**
     * Constructor with the parameter customer
     * @param customers accessing user details to this customer
     */
    public AuthenticationDetails(Customers customers) {
        this.username = customers.getEmail();
        this.password = customers.getPassword();
        Role role = customers.getRole();
        authorities.add(new SimpleGrantedAuthority(role.toString()));
    }




    /**
     * Gets authorities
     * @return collection of granted authority
     */
    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    /**
     * Gets password
     * @return password
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * Gets username
     * @return username
     */
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    /**
     * Checks if the user details is enabled
     * @return true if it is enabled
     */
    @Override
    public boolean isEnabled() {
        return true;
    }

}