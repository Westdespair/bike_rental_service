package no.ntnu.bikerental.repository;

import org.springframework.data.repository.CrudRepository;
import no.ntnu.bikerental.model.Bikes;

public interface BikesRepository extends CrudRepository<Bikes, Long> {
}
