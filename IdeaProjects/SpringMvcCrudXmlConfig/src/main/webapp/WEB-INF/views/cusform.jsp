<%--
  Created by IntelliJ IDEA.
  User: Huy
  Date: 4/1/2020
  Time: 10:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>CusForm</title>
</head>
<body>
<div align="center">
    <h1>Create Customer</h1>

    <form:form action="add-customer" method="post" modelAttribute="customer">
        <table>
            <tr>
                <td><form:hidden  path="id" /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" /></td>
            </tr>

            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
