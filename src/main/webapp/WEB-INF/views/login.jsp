<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Spring Security Example </title>
</head>

<body>
<div >
    ${param.error}
</div>
<div >
    ${param.logout}
</div>

<form action="${loginUrl}" method="post">
    <div><label> User Name : <input type="text" name="username" required="required" /> </label></div>
    <div><label> Password: <input type="password" name="password" required="required" /> </label></div>

    <div><input type="submit" value="Sign In"/></div>
    <div><input type="hidden" name="referrer" value="${param.referrer}" /></div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>



</body>
</html>