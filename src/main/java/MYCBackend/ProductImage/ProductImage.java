package MYCBackend.ProductImage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;


@Entity
@Table(name="ProductImage")
public class ProductImage {
    @Id
    @Column(name="ImageID")
    private UUID imageID;

    @Column(name="ProductID")
    private UUID ProductID;

    @Column(name="ImageURL")
    private String imageURL;

    public ProductImage(UUID imageID, UUID productID, String imageURL) {
        this.imageID = imageID;
        ProductID = productID;
        this.imageURL = imageURL;
    }

    public ProductImage() {
    }

    public UUID getImageID() {
        return imageID;
    }

    public void setImageID(UUID imageID) {
        this.imageID = imageID;
    }

    public UUID getProductID() {
        return ProductID;
    }

    public void setProductID(UUID productID) {
        ProductID = productID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "imageID=" + imageID +
                ", ProductID=" + ProductID +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
