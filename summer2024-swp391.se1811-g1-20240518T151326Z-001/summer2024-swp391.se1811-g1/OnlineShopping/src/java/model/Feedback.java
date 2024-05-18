/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Feedback {
    private int feedback_id;
    private String feedback ;
    private int rate_star;
    private String fb_image_1;
    private String fb_image_2;
    private int user_id;
    private int product_id;
    private int order_id;

    public Feedback() {
    }

    public Feedback(int feedback_id, String feedback, int rate_star, String fb_image_1, String fb_image_2, int user_id, int product_id, int order_id) {
        this.feedback_id = feedback_id;
        this.feedback = feedback;
        this.rate_star = rate_star;
        this.fb_image_1 = fb_image_1;
        this.fb_image_2 = fb_image_2;
        this.user_id = user_id;
        this.product_id = product_id;
        this.order_id = order_id;
    }

    public int getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getRate_star() {
        return rate_star;
    }

    public void setRate_star(int rate_star) {
        this.rate_star = rate_star;
    }

    public String getFb_image_1() {
        return fb_image_1;
    }

    public void setFb_image_1(String fb_image_1) {
        this.fb_image_1 = fb_image_1;
    }

    public String getFb_image_2() {
        return fb_image_2;
    }

    public void setFb_image_2(String fb_image_2) {
        this.fb_image_2 = fb_image_2;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    @Override
    public String toString() {
        return "Feedback{" + "feedback_id=" + feedback_id + ", feedback=" + feedback + ", rate_star=" + rate_star + ", fb_image_1=" + fb_image_1 + ", fb_image_2=" + fb_image_2 + ", user_id=" + user_id + ", product_id=" + product_id + ", order_id=" + order_id + '}';
    }
    
    
}
