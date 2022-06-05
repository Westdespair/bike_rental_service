package no.ntnu.bikerental.model;

public class Transactions{

    private int transactionID;
    private int customerID;


    public Transactions(int transactionID, int customerID){
        this.transactionID = transactionID;
        this.customerID = customerID;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

}
