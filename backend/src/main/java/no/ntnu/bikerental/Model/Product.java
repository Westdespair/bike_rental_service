package no.ntnu.bikerental.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private String productName;
    private String colour;
    private float productPrice;
    private int productID;
    private int description;
    private String colourDuration;
    private int locationID;


    public Product(String productName, String colour, float productPrice, int productID, int description, String colourDuration, int locationID) {
        this.productName = productName;
        this.colour = colour;
        this.productPrice = productPrice;
        this.productID = productID;
        this.colourDuration = colourDuration;
        this.locationID = locationID;
    }


    public String getProductName() {
        return productName;
    }

    public String getColor() {
        return colour;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setColor(String color) {
        this.colour = colour;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(int price) {
        this.productPrice = productPrice;
    }

    public int getDescription() {
        return description;
    }

    public int getProductID() {
        return productID;
    }

    public String getColourDuration() {
        return colourDuration;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setColourDuration(String colourDuration) {
        this.colourDuration = colourDuration;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public String getColour() {
        return colour;
    }

}