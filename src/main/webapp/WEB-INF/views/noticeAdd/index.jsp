<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="_csrf" content="${_csrf.token}">
    <meta name="_csrf_header" content="${_csrf.headerName}">
    <title>GDGoc_fall_study</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/noticeAdd/style.css">
</head>
<body>
<%@ include file="common/header.jsp"%>

<%@ include file="common/footer.jsp"%>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/noticeAdd/script.js"></script>
</body>
</html>