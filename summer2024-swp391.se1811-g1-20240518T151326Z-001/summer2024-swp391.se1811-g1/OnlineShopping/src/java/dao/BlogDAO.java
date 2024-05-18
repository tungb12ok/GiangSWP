/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dal.*;

import dal.*;
import model.BlogCategories;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class BlogDAO extends DBContext {

    private BlogCategoriesDAO bcDAO;

    public BlogDAO() {
        bcDAO = new BlogCategoriesDAO();
    }

    public Blog getBlogByID(int id) {
        String sql = "SELECT blog_id, blog_title, blog_img, blog_main, blog_date, user_id, blog_cate_id FROM Blog WHERE blog_id = ?";
        Blog blog = null;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    blog = new Blog();
                    blog.setBlog_id(rs.getInt("blog_id"));
                    blog.setBlog_title(rs.getString("blog_title"));
                    blog.setBlog_image(rs.getString("blog_img"));
                    blog.setBlog_main(rs.getString("blog_main"));
                    blog.setBlog_date(rs.getDate("blog_date"));
                    blog.setUser_id(rs.getInt("user_id"));
                    blog.setBlog_cate_id(rs.getInt("blog_cate_id"));
                    blog.setBlogCategories(bcDAO.getBlogCategories(rs.getInt("blog_cate_id")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return blog;
    }

    public void addBlog(Blog blog) {
        String query = "INSERT INTO Blog (blog_title, blog_image, blog_main, blog_date, user_id, blog_cate_id, blog_status) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, blog.getBlog_title());
            ps.setString(2, blog.getBlog_image());
            ps.setString(3, blog.getBlog_main());
            ps.setDate(4, new java.sql.Date(blog.getBlog_date().getTime()));
            ps.setInt(5, blog.getUser_id());
            ps.setInt(6, blog.getBlog_cate_id());
            ps.setString(7, blog.getBlog_status());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBlog(Blog blog) {
        String query = "UPDATE Blog SET blog_title = ?, blog_image = ?, blog_main = ?, blog_date = ?, user_id = ?, blog_cate_id = ?, blog_status = ? WHERE blog_id = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, blog.getBlog_title());
            ps.setString(2, blog.getBlog_image());
            ps.setString(3, blog.getBlog_main());
            ps.setDate(4, new java.sql.Date(blog.getBlog_date().getTime()));
            ps.setInt(5, blog.getUser_id());
            ps.setInt(6, blog.getBlog_cate_id());
            ps.setString(7, blog.getBlog_status());
            ps.setInt(8, blog.getBlog_id());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBlog(int id) {
        String query = "DELETE FROM Blog WHERE blog_id = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Blog> getAllBlogs(String status) {
        String query = "SELECT blog_id, blog_title, blog_img, blog_main, blog_date, user_id, blog_cate_id FROM Blog WHERE blog_status = ?";
        List<Blog> blogs = new ArrayList<>();

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, status);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Blog blog = new Blog();
                    blog.setBlog_id(rs.getInt("blog_id"));
                    blog.setBlog_title(rs.getString("blog_title"));
                    blog.setBlog_image(rs.getString("blog_img"));
                    blog.setBlog_main(rs.getString("blog_main"));
                    blog.setBlog_date(rs.getDate("blog_date"));
                    blog.setUser_id(rs.getInt("user_id"));
                    blog.setBlog_cate_id(rs.getInt("blog_cate_id"));
                    blog.setBlogCategories(bcDAO.getBlogCategories(rs.getInt("blog_cate_id")));
                    blogs.add(blog);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return blogs;
    }

    public List<Blog> getFilteredBlogs(String category, String search, String status, int currentPage, int limitPage) {
        List<Blog> blogs = new ArrayList<>();
        StringBuilder queryBuilder = new StringBuilder("SELECT blog_id, blog_title, blog_img, blog_main, blog_date, user_id, blog_cate_id, blog_status FROM Blog WHERE blog_status = ?");

        if (category != null && !category.isEmpty()) {
            queryBuilder.append(" AND blog_cate_id = ?");
        }
        if (search != null && !search.isEmpty()) {
            queryBuilder.append(" AND blog_title LIKE ?");
        }
        queryBuilder.append(" ORDER BY blog_date DESC");

        String query = queryBuilder.toString();

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            int paramIndex = 1;
            ps.setString(paramIndex++, status);

            if (category != null && !category.isEmpty()) {
                ps.setInt(paramIndex++, Integer.parseInt(category));
            }
            if (search != null && !search.isEmpty()) {
                ps.setString(paramIndex, "%" + search + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {
                int count = 0;
                int startIndex = (currentPage - 1) * limitPage;
                int endIndex = startIndex + limitPage;

                while (rs.next() && count < endIndex) {
                    if (count >= startIndex) {
                        Blog blog = new Blog();
                        blog.setBlog_id(rs.getInt("blog_id"));
                        blog.setBlog_title(rs.getString("blog_title"));
                        blog.setBlog_image(rs.getString("blog_img"));
                        blog.setBlog_main(rs.getString("blog_main"));
                        blog.setBlog_date(rs.getDate("blog_date"));
                        blog.setUser_id(rs.getInt("user_id"));
                        blog.setBlog_cate_id(rs.getInt("blog_cate_id"));
                        blog.setBlog_status(rs.getString("blog_status"));
                        blog.setBlogCategories(bcDAO.getBlogCategories(rs.getInt("blog_cate_id")));
                        blogs.add(blog);
                    }
                    count++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return blogs;
    }

    public int countFilteredBlogs(String category, String search, String status) {
        int count = 0;
        StringBuilder queryBuilder = new StringBuilder("SELECT COUNT(*) AS count FROM Blog WHERE blog_status = ?");

        if (category != null && !category.isEmpty()) {
            queryBuilder.append(" AND blog_cate_id = ?");
        }
        if (search != null && !search.isEmpty()) {
            queryBuilder.append(" AND blog_title LIKE ?");
        }

        String query = queryBuilder.toString();

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            int paramIndex = 1;
            ps.setString(paramIndex++, status);

            if (category != null && !category.isEmpty()) {
                ps.setInt(paramIndex++, Integer.parseInt(category));
            }
            if (search != null && !search.isEmpty()) {
                ps.setString(paramIndex, "%" + search + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    count = rs.getInt("count");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static void main(String[] args) {
        BlogDAO bDAO = new BlogDAO();
        System.out.println(bDAO.getFilteredBlogs(null, null, "Active", 1, 10).size());
    }
}
