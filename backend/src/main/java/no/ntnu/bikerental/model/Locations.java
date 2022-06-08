package no.ntnu.bikerental.model;

import javax.persistence.*;
import java.util.Collection;

/**
 *
 */
@Entity
public class Locations {
    private@Id
    @GeneratedValue
    int id;
    private int postalNumber;
    private String address;
    private String locationName;
    private String areaName;

    /**
     *
     * @param id
     * @param postalNumber
     * @param address
     * @param locationName
     * @param areaName
     */
    public Locations(int id, int postalNumber, String address, String locationName, String areaName) {
        this.id = id;
        this.postalNumber = postalNumber;
        this.address = address;
        this.locationName = locationName;
        this.areaName = areaName;
    }

    public Locations() {

    }

    /**
     * Returns the location ID of a bike
     * @return the location ID of a bike
     */
    public int getLocationID() {
        return id;
    }

    /**
     * Returns the postal number of the location
     * @return the postal number of the location
     */
    public int getPostalNumber() {
        return postalNumber;
    }

    /**
     * Returns the address of the location
     * @return the address of the loaction
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the name of the location
     * @return the name of the location
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Returns the name of the area
     * @return the name of the area
     */
    public String getAreaName() {
        return areaName;
    }


    /**
     * Sets a location ID to a rental bike
     * @param locationID the ID for a rental of a bike
     */
    public void setLocationID(int locationID) {
        this.id = locationID;
    }

    /**
     * Sets the postal number of the location
     * @param postalNumber the postal number
     */
    public void setPostalNumber(int postalNumber) {
        this.postalNumber = postalNumber;
    }

    /**
     * Sets the address of the location
     * @param address the address of the location
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the name of the location
     * @param locationName the name of the location
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * Sets the name of the area
     * @param areaName the name of the area
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }


    @OneToMany(mappedBy = "locationID")
    private Collection<BikeRentals> bikeRentals;

    public Collection<BikeRentals> getBikeRentals() {
        return bikeRentals;
    }

    public void setBikeRentals(Collection<BikeRentals> bikeRentals) {
        this.bikeRentals = bikeRentals;
    }
}

