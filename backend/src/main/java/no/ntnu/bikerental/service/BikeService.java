package no.ntnu.bikerental.service;

import no.ntnu.bikerental.model.Bikes;
import no.ntnu.bikerental.repository.BikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class BikeService {
    @Autowired
    BikesRepository bikesRepository;


    /**
     *
     * @param bikesRepository
     */
    public BikeService(BikesRepository bikesRepository){
        this.bikesRepository = bikesRepository;
    }

    public Bikes findBicycleById(long ID) {
        Optional<Bikes> bikes = bikesRepository.findById(ID);

        return bikes.get();
    }

    /**
     *
     * @return
     */
    public List<Bikes> getAllBikes() {
        return (List<Bikes>) bikesRepository.findAll();
    }


    /**
     *
     * @param bikes
     * @return
     */
    public boolean addBicycle(Bikes bikes) {
        boolean added = false;
        if (bikes != null) {
            try {
                findBicycleById(bikes.getBikeID());
            } catch (NoSuchElementException e) {
                bikesRepository.save(bikes);
                added = true;
            }
        }
        return added;
    }

    /**
     *
     * @param bikeID
     * @return
     */
    public boolean deleteBicycle(int bikeID) {
        Optional<Bikes> bikes = bikesRepository.findById((long) bikeID);
        bikes.ifPresent(value -> bikesRepository.delete(value));
        return bikes.isPresent();
    }


}
