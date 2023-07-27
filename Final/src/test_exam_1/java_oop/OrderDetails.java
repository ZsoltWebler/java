package test_exam_1.java_oop;

import java.time.LocalDate;
import java.time.LocalTime;

public class OrderDetails {

    private final LocalDate orderDate;
    private final String postmanId;
    private final String Address;
    private final LocalTime arrivalTime;


    public OrderDetails(LocalDate orderDate, String postmanId, String address, LocalTime arrivalTime) {
        this.orderDate = orderDate;
        this.postmanId = postmanId;
        Address = address;
        this.arrivalTime = arrivalTime;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public String getPostmanId() {
        return postmanId;
    }

    public String getAddress() {
        return Address;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderDate=" + orderDate +
                ", postmanId='" + postmanId + '\'' +
                ", Address='" + Address + '\'' +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
