package MYCBackend.Order;

import MYCBackend.OrderItem.OrderItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Order {
    private UUID orderID, customerID;
    private String receiverName, receiverPhone, receiverAddress, note;
    private int statusID;
    private Date orderDate, deliveryDate;
    private double total;
    private ArrayList<OrderItem> orderItems;

    public Order(UUID orderID, UUID customerID, String receiverName, String receiverPhone, String receiverAddress, String note, int statusID, Date orderDate, Date deliveryDate, double total, ArrayList<OrderItem> orderItems) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.receiverAddress = receiverAddress;
        this.note = note;
        this.statusID = statusID;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.total = total;
        this.orderItems = orderItems;
    }
    
    public Order() {
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }



    public UUID getOrderID() {
        return orderID;
    }

    public void setOrderID(UUID orderID) {
        this.orderID = orderID;
    }

    public UUID getCustomerID() {
        return customerID;
    }

    public void setCustomerID(UUID customerID) {
        this.customerID = customerID;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customerID=" + customerID +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", note='" + note + '\'' +
                ", statusID=" + statusID +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", total=" + total +
                '}';
    }
}
