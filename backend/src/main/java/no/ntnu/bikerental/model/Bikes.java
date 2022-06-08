package no.ntnu.bikerental.model;


import javax.persistence.*;

/**
 *
 */
@Entity
public class Bikes {
    @Id
    @GeneratedValue
    private int bikeID;
    private boolean helmetIncluded;
    private String colour;
    @ManyToOne(cascade = CascadeType.MERGE, fetch= FetchType.EAGER)
    private BikeTypes BikeTypeID;
    /**
     *
     * @param bikeID
     * @param helmetIncluded
     * @param colour
     * @param BikeTypeID
     */
    public Bikes(int bikeID, boolean helmetIncluded, String colour, BikeTypes BikeTypeID){
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
    public BikeTypes getBikeTypeID(){
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
    public void setBikeTypeID(BikeTypes BikeTypeID){
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

