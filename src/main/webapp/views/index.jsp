<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<meta charset="utf-8" />
		<meta name="description" content="" />
		<meta name="viewport" content="width=device-width" />
		<base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/css/bootstrap.min.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/2.1.1/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/webjars/angularjs/1.4.3/angular.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/webjars/angularjs/1.4.3/angular-route.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/webjars/angularjs/1.4.3/angular-cookies.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/module/main_module.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/controller/main_controller.js"></script>

		<title>Live Stories</title>
	</head>
	<body ng-app="app" ng-controller="home as home">
	<div class="container">
		<jsp:include page="navigation.jsp"/>


		<div ng-view class="container"></div>

	</div>
	</body>
</html>
