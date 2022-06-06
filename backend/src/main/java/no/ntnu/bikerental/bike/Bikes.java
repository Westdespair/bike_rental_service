package no.ntnu.bikerental.bike;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class Bikes {
    @Id
    private int bikeID;
    private boolean helmetIncluded;
    private String colour;
    private int BikeTypeID;
    /**
     *
     * @param bikeID
     * @param helmetIncluded
     * @param colour
     * @param BikeTypeID
     */
    public Bikes(int bikeID, boolean helmetIncluded, String colour, int BikeTypeID){
        this.bikeID = bikeID;
        this.helmetIncluded = helmetIncluded;
        this.colour = colour;
        this.BikeTypeID = BikeTypeID;
    }

    public Bikes() {

    }

    /**
     * Returns bike ID for a bike
     * @return bike ID for a bike
     */
    public int getBikeID() {
        return bikeID;
    }

    /**
     * Returns bike types ID for a bike type ex. electric or manual
     * @return bike types ID for a bike type
     */
    public int getBikeTypeID(){
        return BikeTypeID;
    }

    /**
     * Returns the colour of a bike
     * @return the colour of a bike
     */
    public String getColour() {
        return colour;
    }

    /**
     * Returns if a helmet is included with the bike
     * @return true or false if helmet included
     */
    public boolean isHelmetIncluded() {
        return helmetIncluded;
    }



    /**
     * Sets bike ID on a bike
     * @param bikeID ID for a bike
     */
    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }

    /**
     * Sets bike type ID for which type of bike it is
     * @param BikeTypeID the ID of the bike type
     */
    public void setBikeTypeID(int BikeTypeID){
        this.BikeTypeID = BikeTypeID;
    }

    /**
     * Sets the colour of a bike
     * @param colour the colour of a bike
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Sets the state of true if a helmet is included, false if it's not
     * @param helmetIncluded true or false condition for helmet
     */
    public void setHelmetIncluded(boolean helmetIncluded) {
        this.helmetIncluded = helmetIncluded;
    }

}

