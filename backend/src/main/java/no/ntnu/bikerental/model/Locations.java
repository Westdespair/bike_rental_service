package no.ntnu.bikerental.model;

public class Locations {
    private int locationID;
    private int postalNumber;
    private String address;
    private String locationName;
    private String areaName;

    public Locations(int locationID, int postalNumber, String address, String locationName, String areaName) {
        this.locationID = locationID;
        this.postalNumber = postalNumber;
        this.address = address;
        this.locationID = locationID;
        this.areaName = areaName;
    }

    public int getLocationID() {
        return locationID;
    }

    public int getPostalNumber() {
        return postalNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public void setPostalNumber(int postalNumber) {
        this.postalNumber = postalNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }


}

