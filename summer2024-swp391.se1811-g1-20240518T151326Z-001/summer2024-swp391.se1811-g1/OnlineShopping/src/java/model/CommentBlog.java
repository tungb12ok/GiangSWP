/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class CommentBlog {
    private int comment_id;
    private String comment ;
    private int user_id ;
    private int blog_id;
    private String comment_status ;

    public CommentBlog() {
    }

    public CommentBlog(int comment_id, String comment, int user_id, int blog_id, String comment_status) {
        this.comment_id = comment_id;
        this.comment = comment;
        this.user_id = user_id;
        this.blog_id = blog_id;
        this.comment_status = comment_status;
    }

    public String getComment_status() {
        return comment_status;
    }

    public void setComment_status(String comment_status) {
        this.comment_status = comment_status;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    @Override
    public String toString() {
        return "CommentBlog{" + "comment_id=" + comment_id + ", comment=" + comment + ", user_id=" + user_id + ", blog_id=" + blog_id + '}';
    }
    
    
}
