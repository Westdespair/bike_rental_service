package no.ntnu.bikerental.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity()
public class Comments {
    @Id
    @GeneratedValue
    @Column(unique = true)
    private int commentID;
    private String content;
    private LocalDateTime postDate;
    private LocalDateTime editDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "locations", nullable = false)
    private Customers customerID;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "locations", nullable = false)
    private Products productID;


    public Comments(int commentID, String content, Products productID, LocalDateTime postDate, LocalDateTime editDate, Customers customerID){
        this.commentID = commentID;
        this.content = content;
        this.productID = productID;
        this.postDate = postDate;
        this.editDate = editDate;
        this.customerID =customerID;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    public LocalDateTime getEditDate() {
        return editDate;
    }

    public void setEditDate(LocalDateTime editDate) {
        this.editDate = editDate;
    }

    public Customers getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customers customerID) {
        this.customerID = customerID;
    }

    public Products getProductID() {
        return productID;
    }

    public void setProductID(Products productID) {
        this.productID = productID;
    }
}
