<%--
  Created by IntelliJ IDEA.
  User: Aleksandr
  Date: 7/27/2016
  Time: 5:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #table{
            margin-right: auto;
            margin-left: auto;
            width: 50%;
            height: 50%;
            border-style: solid;
            border-color: grey;
        }
        #header{
            margin-left: 25%;
        }
        #footer{
            margin-left: 25%;
        }
        .td{
            border-style: solid;
            border-color: grey;
            padding: 5% 5% 5% 5%;
        }
    </style>
</head>
<body>

    <jsp:include page="navigation.jsp"/>

    <section>
        <div id="header">
            <h2>Collection of Stories</h2>
        </div>
        <table id="table">
            <tr>
                <td class="td">Title</td>
            </tr>
            <c:forEach items="${collection}" var="story">
                <tr>
                    <td class="td">${story.getTitle()}</td>
                </tr>
            </c:forEach>
        </table>
        <div id="footer">
            <a href="<c:url value='' />">Add New Story</a>
        </div>
    </section>
</body>
</html>
