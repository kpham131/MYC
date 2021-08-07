package MYCBackend.Size;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity()
@Table(name="Size")
public class Size {
    @Id
    @Column(name="SizeID")
    private int sizeID;

    @Column(name="ProductID")
    private int productID;

    @Column(name="SizeName")
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