package no.ntnu.bikerental.Model;

public class Bikes {
    private int bikeID;
    private int bikeTypeID;
    private boolean helmetIncluded;
    private String colour;


    public Bikes(int bikeID, int bikeTypeID, boolean helmetIncluded, String colour){
        this.bikeID = bikeID;
        this.bikeTypeID = bikeTypeID;
        this.helmetIncluded = helmetIncluded;
        this.colour = colour;
    }

    public int getBikeID() {
        return bikeID;
    }

    public int getBikeTypeID() {
        return bikeTypeID;
    }

    public String getColour() {
        return colour;
    }

    public boolean isHelmetIncluded() {
        return helmetIncluded;
    }

    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }

    public void setBikeTypeID(int bikeTypeID) {
        this.bikeTypeID = bikeTypeID;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHelmetIncluded(boolean helmetIncluded) {
        this.helmetIncluded = helmetIncluded;
    }

}

