package no.ntnu.bikerental.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Orders {
    @Id
    @GeneratedValue
    private int orderID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "transactionID", nullable = false)
    @JsonIgnore
    private int transactionID;
    private int productID;
    private int rentalID;

    public Orders(int orderID, int transactionID, int productID, int rentalID) {
        this.orderID = orderID;
        this.transactionID = transactionID;
        this.productID = productID;
        this.rentalID = rentalID;
    }

    public Orders() {

    }


    public int getOrderID() {
        return orderID;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public int getProductID() {
        return productID;
    }

    public int getRentalID() {
        return rentalID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setRentalID(int rentalID) {
        this.rentalID = rentalID;
    }
}
