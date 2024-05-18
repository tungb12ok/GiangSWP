/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class OrderDetails {
    private int orderDetail_id ;
    private int orderQuantity;
    private int order_id;
    private int product_id;

    public OrderDetails() {
    }

    public OrderDetails(int orderDetail_id, int orderQuantity, int order_id, int product_id) {
        this.orderDetail_id = orderDetail_id;
        this.orderQuantity = orderQuantity;
        this.order_id = order_id;
        this.product_id = product_id;
    }

    public int getOrderDetail_id() {
        return orderDetail_id;
    }

    public void setOrderDetail_id(int orderDetail_id) {
        this.orderDetail_id = orderDetail_id;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "orderDetail_id=" + orderDetail_id + ", orderQuantity=" + orderQuantity + ", order_id=" + order_id + ", product_id=" + product_id + '}';
    }
    
    
    
    
}
