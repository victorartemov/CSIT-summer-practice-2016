<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
				 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>	
		<base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Protected page</title>
	</head>
	<body>
		<h3>Message : ${message}</h3>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h4>Welcome : ${pageContext.request.userPrincipal.name} | <c:url value="login?logout" var="logoutUrl" />
				<a href="${logoutUrl}">Log Out
				</a>
			</c:if>
		</h4>
		<div>Go to page <a href="protected">one</a>.</div>
		<div>Go to page <a href="confidential">two</a>.</div>

	</body>
</html>
