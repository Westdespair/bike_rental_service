package no.ntnu.bikerental.Model;

public class BikeTypes {

    private int bikeTypeID;
    private String bikeTypeName;
    private int pricePerMinut;
    private int retrievalFree;

    public BikeTypes(int bikeTypeID, String bikeTypeName, int pricePerMinut, int retrievalFree){
        this.bikeTypeID = bikeTypeID;
        this.bikeTypeName = bikeTypeName;
        this.pricePerMinut = pricePerMinut;
        this.retrievalFree = retrievalFree;
    }

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
        return pricePerMinut;
    }

    public void setPricePerMinut(int pricePerMinut) {
        this.pricePerMinut = pricePerMinut;
    }

    public int getRetrievalFree() {
        return retrievalFree;
    }

    public void setRetrievalFree(int retrievalFree) {
        this.retrievalFree = retrievalFree;
    }
}
