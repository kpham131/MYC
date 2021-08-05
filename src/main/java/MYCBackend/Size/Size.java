package MYCBackend.Size;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity()
@Table(name="Size")
public class Size {
    @Id
    @Column(name="SizeID")
    private UUID sizeID;

    @Column(name="ProductID")
    private UUID productID;

    @Column(name="SizeName")
    private String sizeName;

    @Column(name="quantity")
    private int quantity;

    public Size(UUID sizeID, UUID productID, String sizeName, int quantity) {
        this.sizeID = sizeID;
        this.productID = productID;
        this.sizeName = sizeName;
        this.quantity = quantity;
    }
    public Size(){}

    public UUID getSizeID() {
        return sizeID;
    }

    public void setSizeID(UUID sizeID) {
        this.sizeID = sizeID;
    }

    public UUID getProductID() {
        return productID;
    }

    public void setProductID(UUID productID) {
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
