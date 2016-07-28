<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="utf-8" />
    <meta name="description" content="" />
    <meta name="viewport" content="width=device-width" />
    <base href="/" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/css/bootstrap.min.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/2.1.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/angularjs/1.4.3/angular.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/angularJS.js"></script>

</head>

<body ng-app="app" ng-controller="home as home">
    <header> <span> <button class="btn btn-primary">HOME</button></span>
             <span> <button class="btn btn-primary">STORY COLLECTION</button></span>
             <span> <button class="btn btn-primary">MY PROFILE</button></span>

             <span ng-show="!home.authenticated">
                    <a href="/login">
                        <button class="btn btn-primary">LOG IN</button>
                    </a>
             </span>

             <span ng-show="home.authenticated">
                    <button ng-click="home.logout()" class="btn btn-primary">LOG OUT</button>
             </span>
    </header>

    <div ng-show="home.authenticated">
        Logged in as: <span ng-bind="home.user"></span>
    </div>


</body>
</html>
