package no.ntnu.bikerental.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 *
 */
@Entity
public class BikeRentals {
    @Id
    private int rentalID;
    private Date startDate;
    private Date endDate;
    private int locationID;
    private int bikeID;

    /**
     *
     * @param rentalID
     * @param startDate
     * @param endDate
     * @param locationID
     * @param bikeID
     */
    public BikeRentals(int rentalID, Date startDate, Date endDate, int locationID, int bikeID){
        this.rentalID = rentalID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.locationID = locationID;
        this.bikeID = bikeID;
    }

    public BikeRentals(){}

    /**
     * Returns the rental ID of a bike
     * @return the rental ID of a bike
     */
    public int getRentalID() {
        return rentalID;
    }

    /**
     * Returns the start date for rental
     * @return the start date for rental
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Returns the end date for rental
     * @return the end date for rental
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Returns the location ID of a bike
     * @return the location ID of a bike
     */
    public int getLocations() {
        return locationID;
    }

    /**
     * Returns the bike ID of a bike
     * @return the bike ID of a bike
     */
    public int getBikeID() {
        return bikeID;
    }

    /**
     * Sets the rental ID for a bike
     * @param rentalID the rental ID for a bike
     */
    public void setRentalID(int rentalID) {
        this.rentalID = rentalID;
    }

    /**
     * Sets the start date for a rental of a bike
     * @param startDate the start date of rental
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Sets the end date for a rental of a bike
     * @param endDate the end date of rental
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Sets a location ID to a rental bike
     * @param locationID the ID for a rental of a bike
     */
    public void setLocations(int locationID) {
        this.locationID = locationID;
    }

    /**
     * Sets a bike ID to a rental bike
     * @param bikeID the ID of a bike
     */
    public void setBikes(int bikeID) {
        this.bikeID = bikeID;
    }
}
