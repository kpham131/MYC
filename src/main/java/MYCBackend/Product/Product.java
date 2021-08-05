package MYCBackend.Product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="Product")
public class Product {
    @Id
    @Column(name="ProductID")
    private UUID productID;

    @Column(name="CollectionID")
    private UUID collectionID;

    @Column(name="AccountID")
    private UUID accountID;

    @Column(name="ProductDescription")
    private String productDescription;

    @Column(name="price")
    private Double price;

    @Column(name="IsAvailable")
    private boolean isAvailable;

    public Product(UUID productID, UUID collectionID, UUID accountID, String productDescription, Double price, boolean isAvailable) {
        this.productID = productID;
        this.collectionID = collectionID;
        this.accountID = accountID;
        this.productDescription = productDescription;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Product() {
    }

    public UUID getProductID() {
        return productID;
    }

    public void setProductID(UUID productID) {
        this.productID = productID;
    }

    public UUID getCollectionID() {
        return collectionID;
    }

    public void setCollectionID(UUID collectionID) {
        this.collectionID = collectionID;
    }

    public UUID getAccountID() {
        return accountID;
    }

    public void setAccountID(UUID accountID) {
        this.accountID = accountID;
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
                ", accountID=" + accountID +
                ", productDescription='" + productDescription + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
