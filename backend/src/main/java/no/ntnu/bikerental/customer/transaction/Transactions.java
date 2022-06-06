package no.ntnu.bikerental.customer.transaction;

import no.ntnu.bikerental.customer.Customers;

import javax.persistence.*;

/**
 *
 */
@Entity
public class Transactions {
    @Id
    private int transactionID;
    private int customerID;


    /**
     * @param customers
     * @param transactionID
     */
    public Transactions(int customerID, int transactionID) {
        this.customerID = customerID;
        this.transactionID = transactionID;
    }

    public Transactions() {

    }

    /**
     *
     * @return
     */
    public int getTransactionID() {
        return transactionID;
    }

    /**
     *
     * @param transactionID
     */
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    /**
     *
     * @return
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     *
     * @param customerID
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
