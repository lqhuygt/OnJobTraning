<%--
  Created by IntelliJ IDEA.
  User: Huy
  Date: 4/2/2020
  Time: 8:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>CusForm</title>
</head>
<body>
<div align="center">
    <h1>update Customer</h1>
<%--Het roi nay--%>
    <c:url var="updateCus" value="/update-customer" ></c:url>
    <form:form action="updateCus" method="post" modelAttribute="customer">
        <table>
            <tr>
                <td><form:hidden  path="id" /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" name="name" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" name="address" /></td>
            </tr>

            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
