package no.ntnu.bikerental.model;

import javax.persistence.*;
@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue
    private int orderID;

    @ManyToOne(cascade = CascadeType.MERGE, fetch= FetchType.EAGER)
    private Transactions transactionID;
    @ManyToOne(cascade = CascadeType.MERGE, fetch= FetchType.EAGER)
    private Products productID;
    @ManyToOne(cascade = CascadeType.MERGE, fetch= FetchType.EAGER)
    private BikeRentals rentalID;

    public Orders(int orderID, Transactions transactionID, Products productID, BikeRentals rentalID) {
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

    public Transactions getTransactionID() {
        return transactionID;
    }

    public Products getProductID() {
        return productID;
    }

    public BikeRentals getRentalID() {
        return rentalID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setTransactionID(Transactions transactionID) {
        this.transactionID = transactionID;
    }

    public void setProductID(Products productID) {
        this.productID = productID;
    }

    public void setRentalID(BikeRentals rentalID) {
        this.rentalID = rentalID;
    }
}
