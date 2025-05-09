<%-- tạo taglib --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%--dùng jstl core in ra 1 giá trị --%>
<a href="products">Ex01</a>
<a href="login.jsp">Ex02</a>
<a href="main.jsp">Ex03</a>
<a href="ex04.jsp">Ex04</a>
<a href="productSearch.jsp">Ex05</a>
<a href="StudentListServlet">Ex06</a>
<a href="productListEx07.jsp">Ex07</a>
<a href="revenueStats.jsp">Ex08</a>
<a href="Ex09">Ex09</a>
</body>
</html>