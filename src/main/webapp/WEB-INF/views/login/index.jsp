<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>로그인페이지</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login/style.css">
</head>
<body>
<%@include file="../common/header.jsp"%>
<div id="login-container-wrapper">
    <div id="login-container">
        <h2>로그인</h2>
        <!--로그인 실패 시 오류 메시지 -->
        <c:if test="${not empty param.error}">
            <p style="color:red;">아이디 또는 비밀번호가 잘못되었습니다.</p>
        </c:if>
        <form action="${pageContext.request.contextPath}/login" method="post">
            <div class="input-group">
                <label for="username">아이디</label>
                <input type="text" id="username" name="username" required></input>
            </div>
            <div class="input-group">
                <label for="username">비밀번호</label>
                <input type="password" id="password" name="password" required></input>
            </div>
            <button type="submit" id="login-button">로그인</button>
        </form>
        <div id="register-link">
            <a href = "${pageContext.request.contextPath}/register">회원가입</a>
        </div>
    </div>
</div>
<%@include file="../common/footer.jsp"%>
</body>
</html>