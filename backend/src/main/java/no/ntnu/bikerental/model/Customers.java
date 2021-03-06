package no.ntnu.bikerental.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "customers")
public class Customers {
    @Id
    @GeneratedValue
    private int customerID;
    private String customerName;
    private String email;
    private String address;
    private String locationName;
    private int postalNumber;
    private String password;
    private Role role;



    public Customers(int customerID, String customerName, String email, String address, String locationName, int postalNumber, String password, Role role){
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
        this.locationName = locationName;
        this.postalNumber = postalNumber;
        this.password = password;
        this.role = role;
    }

    public Customers() {

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

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isValid(){
        return !"".equals(customerName);
    }
}


