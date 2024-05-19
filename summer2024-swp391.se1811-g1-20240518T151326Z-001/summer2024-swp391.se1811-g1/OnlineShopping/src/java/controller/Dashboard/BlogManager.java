/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.Dashboard;

import controller.*;
import dao.BlogCategoriesDAO;
import dao.BlogDAO;
import dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import model.Blog;
import model.BlogCategories;

/**
 *
 * @author ADMINZ
 */
@WebServlet(name = "BlogManager", urlPatterns = {"/blogManager"})
public class BlogManager extends HttpServlet {

    private BlogDAO blogDAO;
    private BlogCategoriesDAO blogCategoriesDAO;
    private UserDAO userDAO;

    @Override
    public void init() {
        blogDAO = new BlogDAO();
        blogCategoriesDAO = new BlogCategoriesDAO();
        userDAO = new UserDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String category = request.getParameter("category");
        String search = request.getParameter("search");
        String status = request.getParameter("status");
        String userId = request.getParameter("userId");

        int currentPage = 1;
        int limitPage = 10;

        if (request.getParameter("page") != null) {
            currentPage = Integer.parseInt(request.getParameter("page"));
        }

        List<Blog> blogs = blogDAO.getFilteredBlogs(category, search, status, userId, currentPage, limitPage);
        int totalBlogs = blogDAO.countFilteredBlogs(category, search, status, userId);
        int totalPages = (int) Math.ceil((double) totalBlogs / limitPage);

        request.setAttribute("blogs", blogs);
        request.setAttribute("totalPages", totalPages);
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("category", category);
        request.setAttribute("search", search);
        request.setAttribute("status", status);
        request.setAttribute("userId", userId);
        request.setAttribute("categories", blogCategoriesDAO.getAllBlogCategories());
        request.setAttribute("users", userDAO.getAllUsers());

        request.getRequestDispatcher("viewManager/blogManager.jsp").forward(request, response);
    }

}
