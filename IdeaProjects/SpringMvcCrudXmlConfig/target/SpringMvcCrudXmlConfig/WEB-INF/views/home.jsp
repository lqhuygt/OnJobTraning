<%--
  Created by IntelliJ IDEA.
  User: Huy
  Date: 4/1/2020
  Time: 10:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Home</title>
</head>
<body>
<div align="center">
    <h1>List Customer</h1>
    <h3><a href="customer-form">Add Customer</a></h3>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Address</th>
            <th>Action</th>
        </tr>
        <c:forEach var="customer" items="${listCustomer}">
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.address}</td>
                <td>
                    <a href="update-customer/${customer.id}">Update</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="delete-customer/${customer.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
