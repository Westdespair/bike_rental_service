package no.ntnu.bikerental.model;

public class BikeTypes {

    private int bikeTypeID;
    private String bikeTypeName;
    private int pricePerMinute;
    private int retrievalFree;

    public BikeTypes(int bikeTypeID, String bikeTypeName, int pricePerMinute, int retrievalFree){
        this.bikeTypeID = bikeTypeID;
        this.bikeTypeName = bikeTypeName;
        this.pricePerMinute = pricePerMinute;
        this.retrievalFree = retrievalFree;
    }

    public BikeTypes(){}

    public int getBikeTypeID() {
        return bikeTypeID;
    }

    public void setBikeTypeID(int bikeTypeID) {
        this.bikeTypeID = bikeTypeID;
    }

    public String getBikeTypeName() {
        return bikeTypeName;
    }

    public void setBikeTypeName(String bikeTypeName) {
        this.bikeTypeName = bikeTypeName;
    }

    public int getPricePerMinut() {
        return pricePerMinute;
    }

    public void setPricePerMinute(int pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    public int getRetrievalFree() {
        return retrievalFree;
    }

    public void setRetrievalFree(int retrievalFree) {
        this.retrievalFree = retrievalFree;
    }
}
