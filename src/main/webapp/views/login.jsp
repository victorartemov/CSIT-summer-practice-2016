<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/css/bootstrap.min.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/2.1.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/angularjs/1.4.3/angular.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/angularJS.js"></script>
    <title>Spring Security Example </title>
</head>

<body>
<div >
    ${param.error}
</div>
<div >
    ${param.logout}
</div>

<p>&nbsp;</p>
<p></p>

<div class="container">
    <div class="panel panel-warning">
        <div class="panel-heading">
            <h2>Login</h2>
        </div>
        <div class="panel-body text-center" >

            <p>&nbsp;</p>
            <p></p>

            <form action="${loginUrl}" method="post" class="form-inline" >
                <div><label> Username <input class="form-control" type="text" name="username" required="required" /> </label></div>
                <div><label> Password <input class="form-control" type="password" name="password" required="required" /> </label></div>

                <div class="col-sm-offset-3 col-sm-10">
                    <input type="submit" class="btn btn-success" value="Sign In"/>
                </div>

                <div><input type="hidden" name="referrer" value="${param.referrer}" /></div>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>

            <p>&nbsp;</p>
            <p></p>

            <div >
                Or you can login with your social network:
            </div>

            <a href="/login/facebook" class="btn btn-primary">Facebook</a>
            <a href="/login/vk" class="btn btn-info">vk.com</a>
            <a href="/login/github" class="btn btn-default">GitHub</a>


            <p>&nbsp;</p>
            <p></p>

        </div>

        <div class="panel-footer">© 2016 Epam's Summer Practice Team.</div>
    </div>


</div>
</body>
</html>