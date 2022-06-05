package no.ntnu.bikerental.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Creates AuthenticationManager, meaning setting up the authentication type
 * The @EnableWebSecurity tells that this is a class for configuring web security
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    /**
     * A service providing the users from the collection
     */
    @Autowired
    private final UserDetailsService userDetailsService;

    /**
     * Constructor with the parameter authenticationDetailsController
     * @param authenticationDetailsController accessing the user service
     */
    public SecurityConfig(AuthenticationDetailsController authenticationDetailsController) {
        this.userDetailsService = authenticationDetailsController;
    }


    /**
     * Configure the authorization rules
     * @param auth AuthenticationManagerBuilder
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsService);
    }

    /**
     * Configure the authorization rules
     * @param http HTTP Security object
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        final String admin = "ADMIN";
        final String user = "USER";
        // Set up the authorization requests, starting from most restrictive at the top, to least restrictive on bottom
        http.csrf().disable().authorizeRequests()
                .antMatchers("/admin").hasRole(admin)
                .antMatchers("/user").hasAnyRole(user,admin)
                .antMatchers("/account").hasAnyRole(user,admin)
                .antMatchers("/account/all-products").hasRole(admin)
                .antMatchers("/account/all-orders").hasRole(admin)
                .antMatchers("/account/all-bikes").hasRole(admin)
                .antMatchers("/account/address").hasAnyRole(user,admin)
                .antMatchers("/account/orders").hasAnyRole(user,admin)
                .antMatchers("/update-password").hasAnyRole(user,admin)
                .antMatchers("/rental").hasAnyRole(user,admin)
                .antMatchers("/rental/confirmation/{id}").hasAnyRole(user,admin)
                .antMatchers("/").permitAll()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/loginOk")
                .usernameParameter("email")
                .passwordParameter("password")
                .and()
                .logout().logoutUrl("/logout")
        //.deleteCookies("JSESSIONID")
        //.invalidateHttpSession(true)
        ;
    }

    /**
     * This method is called to decide what encryption to use for password checking
     * @return The password encryptor
     */
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
