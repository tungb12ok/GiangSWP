/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Order {
    private int order_id;
    private String ship_name ;
    private String ship_email ;
    private String ship_phone ;
    private String ship_address ;
    private String ship_note ;
    private Date order_date ;
    private String order_status ;
    private float order_total;
    private int user_id;
    private int sale_id;

    public Order() {
    }

    public Order(int order_id, String ship_name, String ship_email, String ship_phone, String ship_address, String ship_note, Date order_date, String order_status, float order_total, int user_id, int sale_id) {
        this.order_id = order_id;
        this.ship_name = ship_name;
        this.ship_email = ship_email;
        this.ship_phone = ship_phone;
        this.ship_address = ship_address;
        this.ship_note = ship_note;
        this.order_date = order_date;
        this.order_status = order_status;
        this.order_total = order_total;
        this.user_id = user_id;
        this.sale_id = sale_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getShip_name() {
        return ship_name;
    }

    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }

    public String getShip_email() {
        return ship_email;
    }

    public void setShip_email(String ship_email) {
        this.ship_email = ship_email;
    }

    public String getShip_phone() {
        return ship_phone;
    }

    public void setShip_phone(String ship_phone) {
        this.ship_phone = ship_phone;
    }

    public String getShip_address() {
        return ship_address;
    }

    public void setShip_address(String ship_address) {
        this.ship_address = ship_address;
    }

    public String getShip_note() {
        return ship_note;
    }

    public void setShip_note(String ship_note) {
        this.ship_note = ship_note;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public float getOrder_total() {
        return order_total;
    }

    public void setOrder_total(float order_total) {
        this.order_total = order_total;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    @Override
    public String toString() {
        return "Order{" + "order_id=" + order_id + ", ship_name=" + ship_name + ", ship_email=" + ship_email + ", ship_phone=" + ship_phone + ", ship_address=" + ship_address + ", ship_note=" + ship_note + ", order_date=" + order_date + ", order_status=" + order_status + ", order_total=" + order_total + ", user_id=" + user_id + ", sale_id=" + sale_id + '}';
    }
    
    
    
    
    
    
    
}
