package no.ntnu.bikerental.repository;

import no.ntnu.bikerental.model.Customers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CustomersRepository extends CrudRepository<Customers, Long> {

    @Query(value = "SELECT * FROM customers where email = :email", nativeQuery = true)
    Optional<Customers> findByEmail(@Param("email") String email);
}

