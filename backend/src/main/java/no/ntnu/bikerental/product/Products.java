package no.ntnu.bikerental.product;

import no.ntnu.bikerental.bike.locations.Locations;

import javax.persistence.*;

/**
 *
 */
@Entity(name = "products")
public class Products {
    private String productName;
    private String colour;
    private float productPrice;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int productID;
    private String description;
    private String colourDuration;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "locations", nullable = false)
    private Locations locations;
    private String imagePath;


    /**
     *
     * @param productName
     * @param colour
     * @param productPrice
     * @param productID
     * @param colourDuration
     * @param locations
     * @param description
     * @param imagePath
     */
    public Products(String productName, String colour, float productPrice, int productID, String colourDuration, Locations locations, String description, String imagePath) {
        this.productName = productName;
        this.colour = colour;
        this.productPrice = productPrice;
        this.productID = productID;
        this.colourDuration = colourDuration;
        this.locations = locations;
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
    public Locations getLocationID() {
        return locations;
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
     * @param locations
     */
    public void setLocationID(Locations locations) {
        this.locations = locations;
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