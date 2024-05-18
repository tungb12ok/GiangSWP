/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class BlogCategories {
    private int blog_cate_id;
    private String blog_cate_name ;

    public BlogCategories() {
    }

    public BlogCategories(int blog_cate_id, String blog_cate_name) {
        this.blog_cate_id = blog_cate_id;
        this.blog_cate_name = blog_cate_name;
    }

    public int getBlog_cate_id() {
        return blog_cate_id;
    }

    public void setBlog_cate_id(int blog_cate_id) {
        this.blog_cate_id = blog_cate_id;
    }

    public String getBlog_cate_name() {
        return blog_cate_name;
    }

    public void setBlog_cate_name(String blog_cate_name) {
        this.blog_cate_name = blog_cate_name;
    }

    @Override
    public String toString() {
        return "BlogCategories{" + "blog_cate_id=" + blog_cate_id + ", blog_cate_name=" + blog_cate_name + '}';
    }
    
    
    
}
