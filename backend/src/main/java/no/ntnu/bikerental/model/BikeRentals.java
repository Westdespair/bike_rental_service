package no.ntnu.bikerental.model;

import javax.persistence.*;
import java.sql.Date;

/**
 *
 */
@Entity(name = "bike-rentals")
public class BikeRentals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int rentalID;
    private Date startDate;
    private Date endDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "locationID", nullable = false)
    private Locations locations;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "bikeID", nullable = false)
    private Bikes bikes;

    /**
     *
     * @param rentalID
     * @param startDate
     * @param endDate
     * @param locations
     * @param bikes
     */
    public BikeRentals(int rentalID, Date startDate, Date endDate, Locations locations, Bikes bikes){
        this.rentalID = rentalID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.locations = locations;
        this.bikes = bikes;
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
    public Locations getLocations() {
        return locations;
    }

    /**
     * Returns the bike ID of a bike
     * @return the bike ID of a bike
     */
    public Bikes getBikes() {
        return bikes;
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
     * @param locations the ID for a rental of a bike
     */
    public void setLocations(Locations locations) {
        this.locations = locations;
    }

    /**
     * Sets a bike ID to a rental bike
     * @param bikes the ID of a bike
     */
    public void setBikes(Bikes bikes) {
        this.bikes = bikes;
    }
}
