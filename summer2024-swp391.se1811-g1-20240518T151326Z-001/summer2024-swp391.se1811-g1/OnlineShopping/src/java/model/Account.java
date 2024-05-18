/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Account {
    private int account_id;
    private String user_email ;
    private String user_pass;
    private int account_status;

    public Account() {
    }

    public Account(int account_id, String user_email, String user_pass, int account_status) {
        this.account_id = account_id;
        this.user_email = user_email;
        this.user_pass = user_pass;
        this.account_status = account_status;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public int getAccount_status() {
        return account_status;
    }

    public void setAccount_status(int account_status) {
        this.account_status = account_status;
    }

    @Override
    public String toString() {
        return "Account{" + "account_id=" + account_id + ", user_email=" + user_email + ", user_pass=" + user_pass + ", account_status=" + account_status + '}';
    }
    
    
    
    
}
