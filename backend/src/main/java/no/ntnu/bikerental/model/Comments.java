package no.ntnu.bikerental.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comments {
    @Id
    @GeneratedValue
    private int commentID;
    private String content;
    private LocalDateTime postDate;
    private LocalDateTime editDate;
    @ManyToOne(cascade = CascadeType.MERGE, fetch= FetchType.EAGER)
    private Customers customerID;
    @ManyToOne(cascade = CascadeType.MERGE, fetch= FetchType.EAGER)
    private Products productID;


    /**
     *
     * @param commentID
     * @param content
     * @param productID
     * @param postDate
     * @param editDate
     * @param customerID
     */
    public Comments(int commentID, String content, Products productID, LocalDateTime postDate, LocalDateTime editDate, Customers customerID){
        this.commentID = commentID;
        this.content = content;
        this.productID = productID;
        this.postDate = postDate;
        this.editDate = editDate;
        this.customerID =customerID;
    }

    /**
     *
     */
    public Comments() {

    }

    /**
     *
     * @return
     */
    public int getCommentID() {
        return commentID;
    }

    /**
     *
     * @param commentID
     */
    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    /**
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     *
     * @return
     */
    public LocalDateTime getPostDate() {
        return postDate;
    }

    /**
     *
     * @param postDate
     */
    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    /**
     *
     * @return
     */
    public LocalDateTime getEditDate() {
        return editDate;
    }

    /**
     *
     * @param editDate
     */
    public void setEditDate(LocalDateTime editDate) {
        this.editDate = editDate;
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

    /**
     *
     * @return
     */
    public Products getProductID() {
        return productID;
    }

    /**
     *
     * @param productID
     */
    public void setProductID(Products productID) {
        this.productID = productID;
    }
}
