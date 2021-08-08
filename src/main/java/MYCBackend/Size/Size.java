package MYCBackend.Size;

import javax.persistence.*;


@Entity()
@Table(name="Sizes")
public class Size {
    @Id
    @Column(name="size_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int sizeID;

    @Column(name="product_id")
    private int productID;

    @Column(name="size_name")
    private String sizeName;

    @Column(name="quantity")
    private int quantity;

    public Size(int sizeID, int productID, String sizeName, int quantity) {
        this.sizeID = sizeID;
        this.productID = productID;
        this.sizeName = sizeName;
        this.quantity = quantity;
    }
    public Size(){}

    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Size{" +
                "sizeID=" + sizeID +
                ", productID=" + productID +
                ", sizeName='" + sizeName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}