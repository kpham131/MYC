package MYCBackend.Size;

import javax.persistence.*;


@Entity()
@Table(name="SizeInProduct")
public class SizeInProduct {
    @Id
    @Column(name="size_in_product_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int sizeInProductID;

    @Column(name="product_id")
    private int productID;

    @Column(name="size_name")
    private String sizeName;

    @Column(name="quantity")
    private int quantity;

    public SizeInProduct(int sizeInProductID, int productID, String sizeName, int quantity) {
        this.sizeInProductID = sizeInProductID;
        this.productID = productID;
        this.sizeName = sizeName;
        this.quantity = quantity;
    }
    public SizeInProduct(){}

    public int getSizeInProductID() {
        return sizeInProductID;
    }

    public void setSizeInProductID(int sizeInProductID) {
        this.sizeInProductID = sizeInProductID;
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
        return "SizeInProduct{" +
                "sizeInProductID=" + sizeInProductID +
                ", productID=" + productID +
                ", sizeName='" + sizeName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}