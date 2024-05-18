/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dal.*;
import model.BlogCategories;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BlogCategoriesDAO extends DBContext {

    public void addBlogCategories(BlogCategories category) {
        String query = "INSERT INTO BlogCategories (blog_cate_id, blog_cate_name) VALUES (?, ?)";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, category.getBlog_cate_id());
            ps.setString(2, category.getBlog_cate_name());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public BlogCategories getBlogCategories(int id) {
        String sql = "SELECT blog_cate_id, blog_cate_name FROM BlogCategories WHERE blog_cate_id = ?";
        BlogCategories category = null;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    category = new BlogCategories(rs.getInt("blog_cate_id"), rs.getString("blog_cate_name"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category;
    }

    public List<BlogCategories> getAllBlogCategories() {
        String query = "SELECT blog_cate_id, blog_cate_name FROM BlogCategories";
        List<BlogCategories> categories = new ArrayList<>();

        try (PreparedStatement ps = connection.prepareStatement(query); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                categories.add(new BlogCategories(rs.getInt("blog_cate_id"), rs.getString("blog_cate_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }

    public void updateBlogCategories(BlogCategories category) {
        String query = "UPDATE BlogCategories SET blog_cate_name = ? WHERE blog_cate_id = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, category.getBlog_cate_name());
            ps.setInt(2, category.getBlog_cate_id());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBlogCategories(int id) {
        String query = "DELETE FROM BlogCategories WHERE blog_cate_id = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
