package no.ntnu.bikerental.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int customerID;
    private String customerName;
    private String email;
    private String address;
    private String locationName;
    private int postalNumber;
    private int privilege;


    public Customer(int customerID, String customerName, String email, String address, String locationName, int postalNumber, int privilege){
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
        this.locationName = locationName;
        this.postalNumber = postalNumber;
        this.privilege = privilege;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getLocationName() {
        return locationName;
    }

    public int getPostalNumber() {
        return postalNumber;
    }

    public int getPrivilege() {
        return privilege;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setPostalNumber(int postalNumber) {
        this.postalNumber = postalNumber;
    }

    public void setPrivilege(int privilege) {
        this.privilege = privilege;
    }

    @JsonIgnore
    public boolean isValid() {
        return !"".equals(customerName);
    }
}


