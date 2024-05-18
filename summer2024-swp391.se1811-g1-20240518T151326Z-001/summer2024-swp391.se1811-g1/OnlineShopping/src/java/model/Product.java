/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Product {
    private int product_id;
    private String name ;
    private String product_description ;
    private int quantity;
    private String image1 ;
    private String image2 ;
    private String image3 ;
    private String product_size;
    private String product_color ;
    private float product_origin_price;
    private int product_status ;
    private int category_id;

    public Product() {
    }

    public Product(int product_id, String name, String product_description, int quantity, String image1, String image2, String image3, String product_size, String product_color, float product_origin_price, int product_status, int category_id) {
        this.product_id = product_id;
        this.name = name;
        this.product_description = product_description;
        this.quantity = quantity;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.product_size = product_size;
        this.product_color = product_color;
        this.product_origin_price = product_origin_price;
        this.product_status = product_status;
        this.category_id = category_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getProduct_size() {
        return product_size;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }

    public String getProduct_color() {
        return product_color;
    }

    public void setProduct_color(String product_color) {
        this.product_color = product_color;
    }

    public float getProduct_origin_price() {
        return product_origin_price;
    }

    public void setProduct_origin_price(float product_origin_price) {
        this.product_origin_price = product_origin_price;
    }

    public int getProduct_status() {
        return product_status;
    }

    public void setProduct_status(int product_status) {
        this.product_status = product_status;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", name=" + name + ", product_description=" + product_description + ", quantity=" + quantity + ", image1=" + image1 + ", image2=" + image2 + ", image3=" + image3 + ", product_size=" + product_size + ", product_color=" + product_color + ", product_origin_price=" + product_origin_price + ", product_status=" + product_status + ", category_id=" + category_id + '}';
    }
    
}
