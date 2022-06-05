package no.ntnu.bikerental.repository;

import no.ntnu.bikerental.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    }

