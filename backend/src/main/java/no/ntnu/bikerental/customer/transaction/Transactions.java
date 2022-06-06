package no.ntnu.bikerental.customer.transaction;

import no.ntnu.bikerental.customer.Customers;

import javax.persistence.*;

/**
 *
 */
@Entity(name = "transactions")
public class Transactions{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int transactionID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customerID", nullable = false)
    private Customers customers;



    /**
     *
     * @param customers
     * @param transactionID
     */
    public Transactions(Customers customers, int transactionID) {
        this.customers = customers;
        this.transactionID = transactionID;
    }

    public Transactions() {

    }

    /**
     *
     * @return
     */
    public Customers getCustomers() {
        return customers;
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
     * @param customers
     */
    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    /**
     *
     * @param transactionID
     */
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }
}
