<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Story Collection</title>
</head>
<body>
    <jsp:include page="navigation.jsp"/>
    <div class="container">
        <div>
            <h2>Collection of Stories</h2>
        </div>
        <table class="table">
            <thead>
                <tr>
                    <th>#</th>
                    <th>Name Story</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${collection}" var="story" varStatus="state">
                    <tr>
                        <td> ${state.index+1} </td>
                        <td> ${story.getTitle()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div>
            <button class="btn"> Add New Story </button>
        </div>
    </div>
</body>
</html>
