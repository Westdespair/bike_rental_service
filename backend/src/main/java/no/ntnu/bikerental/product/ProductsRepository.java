package no.ntnu.bikerental.product;

import no.ntnu.bikerental.product.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Integer> {
    }

