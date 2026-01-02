<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>GDGoc_fall_study</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/noticeCheck/style.css">
</head>
<body>
<%@ include file="../common/header.jsp" %>

<form id="menuForm">
    <div id="container">
        <div id="menuAdmin">
            <h2 id="menuAdminH2">공지사항 작성</h2>
            <br>
            <label for="memID">회원 아이디</label>
            <input type="text" id="memID" name="memID" placeholder="회원아이디" maxlength="20" value="${menu.memID}"
                   readonly>
            <br>
            <label for="title">제목</label>
            <input type="text" id="title" name="title" placeholder="제목" maxlength="10" value="${menu.title}">
            <br>
            <label for="content">내용</label>
            <input type="text" id="content" name="content" placeholder="내용" maxlength="30" value="${menu.content}">
            <br>
            <label for="writer">작성자</label>
            <input type="text" id="writer" name="writer" placeholder="작성자" maxlength="10" value="${menu.writer}"
                   readonly>
            <br>

            <input type="hidden" id="indate" name="indate" value="${menu.indate}">
            <div id="buttonContainer">
                <c:if test="${MANAGER == true}">
                    <button type="button" id="buttonUpdate">수정</button>
                    <button type="button" id="buttonDelete">삭제</button>
                </c:if>
            </div>
            <button type="button" id="buttonSubmit">확인</button>
        </div>
    </div>
</form>
<%@ include file="../common/footer.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/noticeCheck/script.js"></script>
</body>
</html>