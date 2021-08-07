package MYCBackend.OrderItem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table (name = "OrderItems")
public class OrderItem {
    @Id
    @Column(name = "order_item_id")
    private UUID orderItemID;

    @Column(name = "order_id")
    private UUID orderID;

    @Column(name = "size_id")
    private int sizeID;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "current_product_price")
    private double currentProductPrice;

    public OrderItem(UUID orderItemID, UUID orderID, int sizeID, int quantity, double currentProductPrice) {
        this.orderItemID = orderItemID;
        this.orderID = orderID;
        this.sizeID = sizeID;
        this.quantity = quantity;
        this.currentProductPrice = currentProductPrice;
    }

    public OrderItem() {
    }

    public UUID getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(UUID orderItemID) {
        this.orderItemID = orderItemID;
    }

    public UUID getOrderID() {
        return orderID;
    }

    public void setOrderID(UUID orderID) {
        this.orderID = orderID;
    }

    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCurrentProductPrice() {
        return currentProductPrice;
    }

    public void setCurrentProductPrice(double currentProductPrice) {
        this.currentProductPrice = currentProductPrice;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemID=" + orderItemID +
                ", orderID=" + orderID +
                ", sizeID=" + sizeID +
                ", quantity=" + quantity +
                ", currentProductPrice=" + currentProductPrice +
                '}';
    }
}