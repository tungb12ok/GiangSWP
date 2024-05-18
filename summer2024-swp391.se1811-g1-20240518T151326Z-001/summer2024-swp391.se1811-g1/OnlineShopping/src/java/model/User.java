/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class User {
    private int user_id;
    private String user_name;
    private int old;
    private boolean gender;
    private String email;
    private String phone;
    private String avata ;
    private int role_id;
    private int user_account_id;
    private String user_address;

    public User() {
    }

    public User(int user_id, String user_name, int old, boolean gender, String email, String phone, String avata, int role_id, int user_account_id, String user_address) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.old = old;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.avata = avata;
        this.role_id = role_id;
        this.user_account_id = user_account_id;
        this.user_address = user_address;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvata() {
        return avata;
    }

    public void setAvata(String avata) {
        this.avata = avata;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getUser_account_id() {
        return user_account_id;
    }

    public void setUser_account_id(int user_account_id) {
        this.user_account_id = user_account_id;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + user_id + ", user_name=" + user_name + ", old=" + old + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", avata=" + avata + ", role_id=" + role_id + ", user_account_id=" + user_account_id + ", user_address=" + user_address + '}';
    }
    
    
    
}
