package MYCBackend.OrderItem;

import java.util.UUID;

public class OrderItem {
    private UUID orderItemID, orderID, sizeID;
    private int quantity;
    private double currentProductPrice;

    public OrderItem(UUID orderItemID, UUID orderID, UUID sizeID, int quantity, double currentProductPrice) {
        this.orderItemID = orderItemID;
        this.orderID = orderID;
        this.sizeID = sizeID;
        this.quantity = quantity;
        this.currentProductPrice = currentProductPrice;
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

    public UUID getSizeID() {
        return sizeID;
    }

    public void setSizeID(UUID sizeID) {
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
