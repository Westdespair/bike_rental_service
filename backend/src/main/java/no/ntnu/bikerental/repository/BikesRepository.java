package no.ntnu.bikerental.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import no.ntnu.bikerental.model.Bikes;
import org.springframework.stereotype.Service;


public interface BikesRepository extends CrudRepository<Bikes, Long> {
}
