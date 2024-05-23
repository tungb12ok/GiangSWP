/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.BlogCategoriesDAO;
import dao.BlogDAO;
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
@WebServlet(name = "BlogViewController", urlPatterns = {"/blogs"})
public class BlogViewController extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String category = request.getParameter("category");
        String search = request.getParameter("search");
        int currentPage = request.getParameter("cp") == null ? 1 : Integer.parseInt(request.getParameter("cp"));
        int limitPage = 10;
        BlogDAO blogDAO = new BlogDAO();
        BlogCategoriesDAO blogCategoryDAO = new BlogCategoriesDAO();
        List<Blog> blogs = blogDAO.getFilteredBlogs(category, search, "Active",null, currentPage, limitPage);
        List<BlogCategories> categories = blogCategoryDAO.getAllBlogCategories();
        int totalBlogs = blogDAO.countFilteredBlogs(category, search,null, "Active");
        int totalPages = (int) Math.ceil(totalBlogs / (double) limitPage);

        request.setAttribute("blogs", blogs);
        request.setAttribute("categories", categories);
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("totalPages", totalPages);
        request.setAttribute("category", category);
        request.setAttribute("search", search);
        request.getRequestDispatcher("blog.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
