package MYCBackend.OrderItem;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table (name = "OrderItems")
public class OrderItem {
    @Id
    @GeneratedValue()
    @Column( name = "order_item_id", columnDefinition = "uuid" )
    private UUID orderItemID;

    @Column(name = "order_id")
    private UUID orderID;

    @Column(name = "size_in_product_id")
    private int sizeInProductID;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "current_product_price")
    private double currentProductPrice;

    public OrderItem(UUID orderItemID, UUID orderID, int sizeInProductID, int quantity, double currentProductPrice) {
        this.orderItemID = orderItemID;
        this.orderID = orderID;
        this.sizeInProductID = sizeInProductID;
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

    public int getSizeInProductID() {
        return sizeInProductID;
    }

    public void setSizeInProductID(int sizeInProductID) {
        this.sizeInProductID = sizeInProductID;
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
                ", sizeInProductID=" + sizeInProductID +
                ", quantity=" + quantity +
                ", currentProductPrice=" + currentProductPrice +
                '}';
    }
}