<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Blogs</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <jsp:include page="common/header.jsp"/>
        <jsp:include page="common/navbar.jsp"/>
        <div class="container-sm">
            <div class="row mt-5">
                <!-- Blog Cards Section -->
                <div class="col-md-9">
                    <h1>Blogs</h1>
                    <form method="get" action="blogs" class="form-inline mb-3">
                        <input type="text" class="form-control mr-2" id="search" name="search" placeholder="Search..." value="${param.search}">
                        <input type="hidden" name="category" value="${param.category}">
                        <input type="hidden" name="status" value="${param.status}">
                        <button type="submit" class="btn btn-primary">Search</button>
                    </form>
                    <div class="row">
                        <c:forEach items="${blogs}" var="blog">
                            <div class="col-md-4 mb-4">
                                <div class="card">
                                    <img src="${blog.blog_image}" class="card-img-top" alt="${blog.blog_title}">
                                    <div class="card-body">
                                        <h5 class="card-title">${blog.blog_title}</h5>
                                        <p class="card-text">${blog.blog_main}</p>
                                        <p class="card-text"><small class="text-muted">${blog.blog_date}</small></p>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <nav aria-label="Page navigation example">
                        <jsp:include page="common/pagging.jsp" />
                    </nav>
                </div>
                <!-- Sidebar for Category Filter -->
                <div class="col-md-3">
                    <h3>Categories</h3>
                    <ul class="list-group">
                        <li class="list-group-item">
                            <a href="?category=&search=${param.search}&status=${param.status}">All</a>
                        </li>
                        <c:forEach items="${categories}" var="category">
                            <li class="list-group-item ${param.category == category.blog_cate_id ? 'active' : ''}">
                                <a href="?category=${category.blog_cate_id}&search=${param.search}&status=${param.status}">${category.blog_cate_name}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
        <jsp:include page="common/foooter.jsp"/>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
