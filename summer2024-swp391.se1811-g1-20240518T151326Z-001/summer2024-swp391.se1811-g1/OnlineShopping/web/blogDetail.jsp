<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Blog Detail</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <!-- Blog Content -->
                <div class="col-md-8">
                    <div class="card mb-4">
                        <div class="card-header">
                            <h2>${blog.blog_title}</h2>
                        </div>
                        <div class="card-body">
                            <img src="${blog.blog_image}" class="img-fluid mb-3" alt="Blog Image">
                            <p class="card-text"><strong>Category:</strong> ${blog.blogCategories.blog_cate_name}</p>
                            <p class="card-text"><strong>Date:</strong> ${blog.blog_date}</p>
                            <p class="card-text">${blog.blog_main}</p>
                        </div>
                        <div class="card-footer text-muted">
                            <p>Written by User: ${blog.user.user_name}</p>
                            <a href="blogs" class="btn btn-primary">Back to Blogs</a>
                        </div>
                    </div>

                    <!-- Comments Section -->
                    <div class="card mb-4">
                        <div class="card-header">
                            <h4>Comments</h4>
                        </div>
                        <div class="card-body">
                            <c:forEach var="comment" items="${comments}">
                                <div class="comment mb-3">
                                    <p><strong>${comment.commenterName}</strong></p>
                                    <p>${comment.commentText}</p>
                                </div>
                            </c:forEach>
                            <form action="blogDetail" method="post">
                                <input type="hidden" name="blogId" value="${blog.blog_id}">
                                <div class="form-group">
                                    <label for="commentText">Comment</label>
                                    <textarea class="form-control" id="commentText" name="commentText" rows="3" required></textarea>
                                </div>
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </form>
                        </div>
                    </div>
                </div>

                <!-- Categories Sidebar -->
                <div class="col-md-4">
                    <div class="card mb-4">
                        <div class="card-header">
                            <h4>Categories</h4>
                        </div>
                        <div class="list-group list-group-flush">
                            <c:forEach var="category" items="${categories}">
                                <a href="blogs.jsp?category=${category.blog_cate_id}" class="list-group-item list-group-item-action">
                                    ${category.blog_cate_name}
                                </a>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
