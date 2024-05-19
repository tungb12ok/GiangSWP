<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Dashboard - SB Admin</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
        <link href="viewManager/css/styles.css" rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed">
        <jsp:include page="common/header.jsp"/>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <jsp:include page="common/leftbar.jsp"/>
            </div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container">
                        <h2 class="mt-4">Blog Management</h2>
                        <form method="get" action="blogManager" id="filterForm">
                            <div class="row">
                                <div class="form-group col-md-2">
                                    <label for="category">Category: </label>
                                    <select name="category" id="category" class="form-control">
                                        <option value="">All</option>
                                        <c:forEach var="cate" items="${categories}">
                                            <option value="${cate.blog_cate_id}" <c:if test="${cate.blog_cate_id == category}">selected</c:if>>${cate.blog_cate_name}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group col-md-2">
                                    <label for="status">Status: </label>
                                    <select name="status" id="status" class="form-control">
                                        <option value="">All</option>
                                        <option value="Active" <c:if test="${status == 'Active'}">selected</c:if>>Active</option>
                                        <option value="InActive" <c:if test="${status == 'InActive'}">selected</c:if>>InActive</option>
                                        </select>
                                    </div>
                                    <div class="form-group col-md-2">
                                        <label for="userId">User: </label>
                                        <select name="userId" id="userId" class="form-control">
                                            <option value="">All</option>
                                        <c:forEach var="user" items="${users}">
                                            <option value="${user.user_id}" <c:if test="${user.user_id == userId}">selected</c:if>>${user.user_name}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group col-md-4">
                                    <label for="search">Search: </label>
                                    <input type="text" name="search" id="search" value="${search}" class="form-control">
                                </div>
                                <div class="form-group col-md-2 align-self-end">
                                    <button type="submit" class="btn btn-primary">Filter</button>
                                </div>
                                <div class="form-group col-md-2 align-self-end">
                                    <button type="button" id="resetButton" class="btn btn-secondary">Reset</button>
                                </div>
                            </div>
                        </form>

                        <script>
                            document.getElementById('resetButton').addEventListener('click', function () {
                                document.getElementById('category').value = "";
                                document.getElementById('status').value = "";
                                document.getElementById('userId').value = "";
                                document.getElementById('search').value = "";
                            });
                        </script>


                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Title</th>
                                    <th>Image</th>
                                    <th>Main</th>
                                    <th>Date</th>
                                    <th>User</th>
                                    <th>Category</th>
                                    <th>Status</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="blog" items="${blogs}">
                                    <tr>
                                        <td>${blog.blog_id}</td>
                                        <td>${blog.blog_title}</td>
                                        <td><img src="${blog.blog_image}" alt="${blog.blog_title}" style="width: 100px;"></td>
                                        <td>${blog.blog_main}</td>
                                        <td>${blog.blog_date}</td>
                                        <td>${blog.getUser().getUser_name()}</td>
                                        <td>${blog.getBlogCategories().getBlog_cate_name()}</td>
                                        <td>${blog.blog_status}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>

                        <nav aria-label="Page navigation">
                            <ul class="pagination">
                                <c:if test="${currentPage > 1}">
                                    <li class="page-item"><a class="page-link" href="manageBlogs?page=${currentPage - 1}&category=${category}&search=${search}&status=${status}&userId=${userId}">Previous</a></li>
                                    </c:if>
                                    <c:forEach begin="1" end="${totalPages}" var="page">
                                    <li class="page-item <c:if test='${currentPage == page}'>active</c:if>'">
                                        <a class="page-link" href="manageBlogs?page=${page}&category=${category}&search=${search}&status=${status}&userId=${userId}">${page}</a>
                                    </li>
                                </c:forEach>
                                <c:if test="${currentPage < totalPages}">
                                    <li class="page-item"><a class="page-link" href="manageBlogs?page=${currentPage + 1}&category=${category}&search=${search}&status=${status}&userId=${userId}">Next</a></li>
                                    </c:if>
                            </ul>
                        </nav>
                    </div>
                </main>
                <jsp:include page="common/footer.jsp"/>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="viewManager/js/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
        <script src="viewManager/assets/demo/chart-area-demo.js"></script>
        <script src="viewManager/assets/demo/chart-bar-demo.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js" crossorigin="anonymous"></script>
        <script src="viewManager/js/datatables-simple-demo.js"></script>
    </body>
</html>
