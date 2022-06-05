package no.ntnu.bikerental.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Products {
    @Id
    @GeneratedValue
    private String productName;
    private String colour;
    private float productPrice;
    private int productID;
    private String description;
    private String colourDuration;
    private int locationID;
    private String imagePath;


    public Products(String productName, String colour, float productPrice, int productID, String colourDuration, int locationID, String description, String imagePath) {
        this.productName = productName;
        this.colour = colour;
        this.productPrice = productPrice;
        this.productID = productID;
        this.colourDuration = colourDuration;
        this.locationID = locationID;
        this.description = description;
        this.imagePath = imagePath;
    }

    public Products() {

    }


    /**
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     *
     * @return
     */
    public String getColour() {
        return colour;
    }

    /**
     *
     * @return
     */
    public float getProductPrice() {
        return productPrice;
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
     * @return
     */
    public String getColourDuration() {
        return colourDuration;
    }

    /**
     *
     * @return
     */
    public int getLocationID() {
        return locationID;
    }

    /**
     *
     * @return
     */
    public String getDescription(){
        return description;
    }

    /**
     *
     * @return
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     *
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     *
     * @param productPrice
     */
    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    /**
     *
     * @param productID
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    /**
     *
     * @param colourDuration
     */
    public void setColourDuration(String colourDuration) {
        this.colourDuration = colourDuration;
    }

    /**
     *
     * @param locationID
     */
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @param imagePath
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}