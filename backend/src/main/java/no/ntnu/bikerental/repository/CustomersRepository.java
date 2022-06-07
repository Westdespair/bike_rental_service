package no.ntnu.bikerental.repository;

import no.ntnu.bikerental.model.Customers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CustomersRepository extends CrudRepository<Customers, Long> {

    /**
     * Gets a customer that has this email
     * @param email email to look for
     * @return the user that natcged this email
     */
    @Query(value = "SELECT * FROM public.customer where email = :email", nativeQuery = true)
    Optional<Customers> findByEmail(@Param("email") String email);

    Optional<Customers> findByEmailEqualsIgnoreCase(@NonNull String email);
}

