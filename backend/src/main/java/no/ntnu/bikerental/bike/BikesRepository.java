package no.ntnu.bikerental.bike;

import org.springframework.data.repository.CrudRepository;
import no.ntnu.bikerental.bike.Bikes;

public interface BikesRepository extends CrudRepository<Bikes, Long> {
}
