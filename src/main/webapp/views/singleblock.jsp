<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/css/bootstrap.min.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/2.1.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/angularjs/1.4.3/angular.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/angularjs/1.4.3/angular-route.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/angularjs/1.4.3/angular-cookies.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/angularJS.js"></script>

    <title>Single block</title>
</head>
<body>
    <jsp:include page="navigation.jsp"></jsp:include>
    <div class="container" style="margin-top: 2%">
        <div class="row">
            <div class="well col-md-6 col-md-offset-3">
                AngularJS Controllers are most useful part of an AngularJS application. These are javascript functions/objects which perform majority of UI related work. They can be considered as the driver for Model and View changes. They are the gateway between the model (the data in our application), and the view (whatever a users sees on screen and interacts with).
            </div>
        </div>
        <div class="row">
            <div class="col-md-8 col-md-offset-3">
                <div class="col-md-2">
                    <a href="#" class="btn btn-default"> Sequel 1</a>
                </div>
                <div class="col-md-2">
                    <a href="#" class="btn btn-default"> Sequel 2</a>
                </div>
                <div class="col-md-2">
                    <a href="#" class="btn btn-default"> Sequel 3</a>
                </div>
                <div class="col-md-2">
                    <a href="#" class="btn"> Likes</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
