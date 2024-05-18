/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Company {
    private int company_id;
    private String company_name ;
    private int product_id ;

    public Company() {
    }

    public Company(int company_id, String company_name, int product_id) {
        this.company_id = company_id;
        this.company_name = company_name;
        this.product_id = product_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "Company{" + "company_id=" + company_id + ", company_name=" + company_name + ", product_id=" + product_id + '}';
    }
    
    
    
    
}
