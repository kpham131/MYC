package MYCBackend.Product;

import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="Products")
public class Product {
    @Id
    @Column(name="ProductID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int productID;

    @Column(name="CollectionID")
    private int collectionID;

    @Column(name="ProductName")
    private String productName;

    @Column(name="ProductDescription")
    private String productDescription;

    @Column(name="Price")
    private Double price;

    @Column(name="IsAvailable")
    private boolean isAvailable;

    public Product(int productID, String productName, int collectionID, String productDescription, Double price, boolean isAvailable) {
        this.productID = productID;
        this.collectionID = collectionID;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Product() {
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getCollectionID() {
        return collectionID;
    }

    public void setCollectionID(int collectionID) {
        this.collectionID = collectionID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", collectionID=" + collectionID +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}