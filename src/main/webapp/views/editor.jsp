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
    <title>Editor</title>
    <style type="text/css">
        #table{
            margin-right: auto;
            margin-left: auto;
            margin-top: 10%;
            width: 50%;
            height: 50%;
        }
    </style>
</head>
<body>
    <jsp:include page="navigation.jsp"/>

    <form:form modelAttribute="fragment">
        <table id="table">
            <tr>
                <td> <label for="title">Title: </label> <form:input placeholder="Enter title of fragment" path="title" id="title"/> </td>
            </tr>

            <tr>
                <td> <label for="text">Text: </label> <form:textarea placeholder="Enter text of fragment" path="text" id="text"/> </td>
            </tr>

            <tr>
                <td> <label for="text1"> Sequel 1: </label> <input placeholder="Enter title sequel of fragment" type="text" name="text1" id="text1"></td>
            </tr>

            <tr>
                <td> <label for="text2"> Sequel 2: </label> <input placeholder="Enter title sequel of fragment" type="text" name="text2" id="text2"></td>
            </tr>

            <tr>
                <td> <label for="text3"> Sequel 3: </label> <input placeholder="Enter title sequel of fragment" type="text" name="text3" id="text3"></td>
            </tr>

            <tr>
                <td> <input type="submit" value="Save" formaction="editor" formmethod="post"/> </td>
                <td> <input type="submit" value="Cancel" formaction="/" formmethod="get"/> </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
