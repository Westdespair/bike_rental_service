package no.ntnu.bikerental.repository;

import no.ntnu.bikerental.model.Bikes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikesRepository extends CrudRepository<Bikes, Long> {
}
