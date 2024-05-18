/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Sale {
    private int sale_id;
    private int user_id;
    private int company_id;

    public Sale() {
    }

    public Sale(int sale_id, int user_id, int company_id) {
        this.sale_id = sale_id;
        this.user_id = user_id;
        this.company_id = company_id;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    @Override
    public String toString() {
        return "Sale{" + "sale_id=" + sale_id + ", user_id=" + user_id + ", company_id=" + company_id + '}';
    }
    
    
    
    
    
    
}
