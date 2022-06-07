package no.ntnu.bikerental.model;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "Products")
public class Products {
    private String productName;
    private String colour;
    private float productPrice;
    @Id
    @GeneratedValue
    private int productID;
    private String description;
    private String colourDuration;

    @ManyToOne(cascade = CascadeType.MERGE, fetch= FetchType.EAGER)
    private Locations locationsID;
    private String imagePath;


    /**
     * @param productName
     * @param colour
     * @param productPrice
     * @param productID
     * @param colourDuration
     * @param locationsID
     * @param description
     * @param imagePath
     */
    public Products(String productName, String colour, float productPrice, int productID, String colourDuration, Locations locationsID, String description, String imagePath) {
        this.productName = productName;
        this.colour = colour;
        this.productPrice = productPrice;
        this.productID = productID;
        this.colourDuration = colourDuration;
        this.locationsID = locationsID;
        this.description = description;
        this.imagePath = imagePath;
    }

    /**
     *
     */
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
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
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
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
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
     * @param productPrice
     */
    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
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

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
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
     * @return
     */
    public String getColourDuration() {
        return colourDuration;
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
     * @return
     */
    public Locations getLocationsID() {
        return locationsID;
    }

    /**
     *
     * @param locationsID
     */
    public void setLocationsID(Locations locationsID) {
        this.locationsID = locationsID;
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
     * @param imagePath
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}

