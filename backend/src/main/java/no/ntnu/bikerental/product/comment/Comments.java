package no.ntnu.bikerental.product.comment;

import no.ntnu.bikerental.customer.Customers;
import no.ntnu.bikerental.product.Products;

import javax.persistence.*;
import java.time.LocalDateTime;


public class Comments {

    private int commentID;
    private String content;
    private LocalDateTime postDate;
    private LocalDateTime editDate;

    private int customerID;

    private int productID;


    /**
     *
     * @param commentID
     * @param content
     * @param productID
     * @param postDate
     * @param editDate
     * @param customerID
     */
    public Comments(int commentID, String content, int productID, LocalDateTime postDate, LocalDateTime editDate, int customerID){
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

    /**
     *
     * @return
     */
    public int getProductID() {
        return productID;
    }

    /**
     *
     * @param productID
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }
}
