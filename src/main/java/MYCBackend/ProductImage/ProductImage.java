package MYCBackend.ProductImage;

import javax.persistence.*;


@Entity
@Table(name="ProductImages")
public class ProductImage {
    @Id
    @Column(name="image_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageID;


    @Column(name="product_id")
//    @JoinColumn(name = "product_id")
    private int productID;

    @Column(name="image_url")
    private String imageURL;

    public ProductImage(int imageID, int productID, String imageURL) {
        this.imageID = imageID;
        this.productID = productID;
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
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
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
                ", ProductID=" + productID +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}