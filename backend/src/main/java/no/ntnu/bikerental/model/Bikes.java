package no.ntnu.bikerental.model;

import javax.persistence.*;

/**
 *
 */
@Entity(name = "bikes")
public class Bikes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int bikeID;
    private boolean helmetIncluded;
    private String colour;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "bikeTypeID", nullable = false)
    private BikeTypes bikeTypes;

    /**
     *
     * @param bikeID
     * @param helmetIncluded
     * @param colour
     * @param bikeTypes
     */
    public Bikes(int bikeID, boolean helmetIncluded, String colour, BikeTypes bikeTypes){
        this.bikeID = bikeID;
        this.helmetIncluded = helmetIncluded;
        this.colour = colour;
        this.bikeTypes = bikeTypes;
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
        return bikeTypes;
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
     * @param bikeTypes the ID of the bike type
     */
    public void setBikeTypeID(BikeTypes bikeTypes){
        this.bikeTypes = bikeTypes;
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

