<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul class="pagination justify-content-center">
    <c:if test="${currentPage > 1}">
        <li class="page-item">
            <a class="page-link" href="?cp=1&category=${param.category}&search=${param.search}&status=${param.status}">First</a>
        </li>
        <li class="page-item">
            <a class="page-link" href="?cp=${currentPage - 1}&category=${param.category}&search=${param.search}&status=${param.status}">&laquo;</a>
        </li>
    </c:if>
    <c:forEach var="i" begin="1" end="${totalPages}">
        <li class="page-item ${i == currentPage ? 'active' : ''}">
            <a class="page-link" href="?cp=${i}&category=${param.category}&search=${param.search}&status=${param.status}">${i}</a>
        </li>
    </c:forEach>
    <c:if test="${currentPage < totalPages}">
        <li class="page-item">
            <a class="page-link" href="?cp=${currentPage + 1}&category=${param.category}&search=${param.search}&status=${param.status}">&raquo;</a>
        </li>
        <li class="page-item">
            <a class="page-link" href="?cp=${totalPages}&category=${param.category}&search=${param.search}&status=${param.status}">Last</a>
        </li>
    </c:if>
</ul>