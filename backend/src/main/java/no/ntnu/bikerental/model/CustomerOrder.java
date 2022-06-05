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
    private Customer customer;

    @Transient
    private Product product;


    public CustomerOrder(Customer customer, Product product){
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

    public Product getProduct(){
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getID(){
        return ID;
    }
}
