package no.ntnu.bikerental.model;

import javax.persistence.*;

@Entity
public class CustomerOrder {

    @Id
    @GeneratedValue

    private int ID;
    private String email;

    @JoinColumn
    @Transient
    private Customers customer;

    @Transient
    private Products product;


    public CustomerOrder(Customers customer, Products product){
        this.customer = customer;
        this.product = product;
    }


    public int getId() {
        return ID;
    }

    public CustomerOrder(){

    }

    public CustomerOrder(int ID, String email){
        this.ID = ID;
        this.email = email;
    }

    public Products getProduct(){
        return products;
    }

    public void setProduct(Products products) {
        this.product = product;
    }

    public int getID(){
        return ID;
    }
}
