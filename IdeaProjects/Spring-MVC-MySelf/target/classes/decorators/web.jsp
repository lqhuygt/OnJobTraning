
<%--
  Created by IntelliJ IDEA.
  User: Huy
  Date: 2/22/2020
  Time: 9:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Small Business - Start Bootstrap Template</title>

    <!-- Bootstrap core CSS -->

    <link href="<c:url value='/template/web/vendor/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template -->

    <link href="<c:url value='/template/web/css/small-business.css'/>" rel="stylesheet" type="text/css">

</head>
<body>


<!-- Navigation -->
<%@include file="/common/web/header.jsp"%>

<dec:body/>

<!-- Footer -->
<<%@include file="/common/web/footer.jsp"%>

<!-- Bootstrap core JavaScript -->

<link href="<c:url value='/template/web/vendor/jquery/jquery.min.js'/>" rel="stylesheet" type="text/css">


<link href="<c:url value='/template/web/vendor/bootstrap/js/bootstrap.bundle.min.js'/>" rel="stylesheet" type="text/css">


</body>
</html>
