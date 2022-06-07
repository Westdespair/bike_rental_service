package no.ntnu.bikerental.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 */
@Entity
@Table(name = "BikeTypes")
public class BikeTypes {
    @Id
    @GeneratedValue
    private int bikeTypeID;
    private String bikeTypeName;
    private int pricePerMinute;
    private int retrievalFree;

    /**
     *
     * @param bikeTypeID
     * @param bikeTypeName
     * @param pricePerMinute
     * @param retrievalFree
     */
    public BikeTypes(int bikeTypeID, String bikeTypeName, int pricePerMinute, int retrievalFree){
        this.bikeTypeID = bikeTypeID;
        this.bikeTypeName = bikeTypeName;
        this.pricePerMinute = pricePerMinute;
        this.retrievalFree = retrievalFree;
    }

    /**
     *
     */
    public BikeTypes(){}

    /**
     *
     * @return
     */
    public int getBikeTypeID() {
        return bikeTypeID;
    }

    /**
     *
     * @param bikeTypeID
     */
    public void setBikeTypeID(int bikeTypeID) {
        this.bikeTypeID = bikeTypeID;
    }

    /**
     *
     * @return
     */
    public String getBikeTypeName() {
        return bikeTypeName;
    }

    /**
     *
     * @param bikeTypeName
     */
    public void setBikeTypeName(String bikeTypeName) {
        this.bikeTypeName = bikeTypeName;
    }

    /**
     *
     * @return
     */
    public int getPricePerMinute() {
        return pricePerMinute;
    }

    /**
     *
     * @param pricePerMinute
     */
    public void setPricePerMinute(int pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    /**
     *
     * @return
     */
    public int getRetrievalFree() {
        return retrievalFree;
    }

    /**
     *
     * @param retrievalFree
     */
    public void setRetrievalFree(int retrievalFree) {
        this.retrievalFree = retrievalFree;
    }
}
