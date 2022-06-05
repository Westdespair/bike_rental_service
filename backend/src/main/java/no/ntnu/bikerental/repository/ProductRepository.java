package no.ntnu.bikerental.repository;

import no.ntnu.bikerental.model.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Products, Integer> {
    }

