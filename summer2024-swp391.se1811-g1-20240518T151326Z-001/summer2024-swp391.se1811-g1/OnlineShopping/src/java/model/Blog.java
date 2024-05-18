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
public class Blog {
    private int blog_id;
    private String blog_title ;
    private String blog_image;
    private String blog_main ;
    private Date blog_date ;
    private int user_id ;
    private int blog_cate_id;
    private String blog_status;
    private BlogCategories blogCategories;

    public Blog() {
    }

    public Blog(int blog_id, String blog_title, String blog_image, String blog_main, Date blog_date, int user_id, int blog_cate_id, String blog_status) {
        this.blog_id = blog_id;
        this.blog_title = blog_title;
        this.blog_image = blog_image;
        this.blog_main = blog_main;
        this.blog_date = blog_date;
        this.user_id = user_id;
        this.blog_cate_id = blog_cate_id;
        this.blog_status = blog_status;
    }

    public String getBlog_status() {
        return blog_status;
    }

    public void setBlog_status(String blog_status) {
        this.blog_status = blog_status;
    }

    public BlogCategories getBlogCategories() {
        return blogCategories;
    }

    public void setBlogCategories(BlogCategories blogCategories) {
        this.blogCategories = blogCategories;
    }

    
    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public String getBlog_title() {
        return blog_title;
    }

    public void setBlog_title(String blog_title) {
        this.blog_title = blog_title;
    }

    public String getBlog_image() {
        return blog_image;
    }

    public void setBlog_image(String blog_image) {
        this.blog_image = blog_image;
    }

    public String getBlog_main() {
        return blog_main;
    }

    public void setBlog_main(String blog_main) {
        this.blog_main = blog_main;
    }

    public Date getBlog_date() {
        return blog_date;
    }

    public void setBlog_date(Date blog_date) {
        this.blog_date = blog_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBlog_cate_id() {
        return blog_cate_id;
    }

    public void setBlog_cate_id(int blog_cate_id) {
        this.blog_cate_id = blog_cate_id;
    }

    @Override
    public String toString() {
        return "Blog{" + "blog_id=" + blog_id + ", blog_title=" + blog_title + ", blog_image=" + blog_image + ", blog_main=" + blog_main + ", blog_date=" + blog_date + ", user_id=" + user_id + ", blog_cate_id=" + blog_cate_id + '}';
    }
    
    
    
    
}
