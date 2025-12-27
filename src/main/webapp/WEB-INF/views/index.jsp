<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>GDGoc_fall_study</title>
    <link rel="stylesheet" type="text/css" href="${PageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<%@ include file="common/header.jsp"%>
<div id="container">
    <div id="menuAdmin">
        <h2 id="menuAdminH2">공지사항</h2>
        <c:if test="${MANAGER == true}">
            <button type="button" onclick="location.href=`${pageContext.request.contextPath}/noticeAdd  `"></button>
        </c:if>
        <div id="menuList">

        </div>
    </div>
</div>
<%@ include file="common/footer.jsp"%>
</body>
</html>