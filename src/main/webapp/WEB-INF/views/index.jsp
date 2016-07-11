<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
	<head>
		<base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Hello World</title>
	</head>
	<body>
		<section>
			<h3>Message : ${message}</h3>
		</section>
		<div>Go to page <a href="protected">one</a>.</div>
		<div>Go to page <a href="confidential">two</a>.</div>
	</body>
</html>
