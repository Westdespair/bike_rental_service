package no.ntnu.bikerental.model;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "Transactions")
public class Transactions {
    @Id
    @GeneratedValue
    private int transactionID;
    @ManyToOne(cascade = CascadeType.MERGE, fetch= FetchType.EAGER)
    private Customers customerID;


    /**
     * @param customerID
     * @param transactionID
     */
    public Transactions(Customers customerID, int transactionID) {
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
    public Customers getCustomerID() {
        return customerID;
    }

    /**
     *
     * @param customerID
     */
    public void setCustomerID(Customers customerID) {
        this.customerID = customerID;
    }
}
