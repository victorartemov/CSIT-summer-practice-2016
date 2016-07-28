<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script src="<c:url value='/static/js/angularJS.js'/>"></script>

		<title>Hello World</title>
	</head>
	<body ng-app="app">
		<jsp:include page="navigation.jsp"/>
		<section>
			<h3>Message : ${fragment.getTitle()} ${fragment.getText()}</h3>
		</section>
		<div>Go to page <a href="editor">EDITOR</a>.</div>
	</body>
</html>
