package no.ntnu.bikerental.authentication;

import no.ntnu.bicycle.model.Customer;
import no.ntnu.bicycle.model.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Containing authentication information, needed by UserDetailsService
 */
public class AuthenticationDetailsController implements UserDetails {
    private final String username;
    private final String password;
    private final boolean isActive;
    private final List<GrantedAuthority> authorities = new LinkedList<>();

    /**
     * Constructor with the parameter customer
     * @param customer accessing user details to this customer
     */
    public AccessUserDetails(Customer customer) {
        this.username = customer.getEmail();
        this.password = customer.getPassword();
        this.isActive = customer.isActive();
        Role role = customer.getRole();
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

    /**
     * Checks if account is non expired
     * @return true if it is active and non expired
     */
    @Override
    public boolean isAccountNonExpired() {
        return isActive;
    }

    /**
     * Checks if the account is non locked
     * @return true if it is active and not locked
     */
    @Override
    public boolean isAccountNonLocked() {
        return isActive;
    }

    /**
     * Checks if the credentials is non expired
     * @return true if it is active and non expired
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return isActive;
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