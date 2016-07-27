<%--
  Created by IntelliJ IDEA.
  User: Aleksandr
  Date: 7/27/2016
  Time: 5:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="navigation.jsp"/>
    <form:form method="post" modelAttribute="fragment">
        <table>
            <tr>
                <td><label path="title">Title: </label> </td>
                <td><form:input path="title" id="title"/></td>
            </tr>

            <tr>
                <td><label path="text">Text: </label> </td>
                <td><form:textarea path="text" id="text"/></td>
            </tr>

            <tr>
                <td colspan="3">
                    <input type="submit" value="Save"/>
                </td>
                <td colspan="3">
                    <input type="submit" value="Cancel"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
