package MYCBackend.ProductImage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="ProductImage")
public class ProductImage {
    @Id
    @Column(name="ImageID")
    private int imageID;

    @Column(name="ProductID")
    private int ProductID;

    @Column(name="ImageURL")
    private String imageURL;

    public ProductImage(int imageID, int productID, String imageURL) {
        this.imageID = imageID;
        ProductID = productID;
        this.imageURL = imageURL;
    }

    public ProductImage() {
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
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