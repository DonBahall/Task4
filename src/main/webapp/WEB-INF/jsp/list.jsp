<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome!</title>
</head>
<body>
<table>
    <tr><th>Name</th><th>Login</th><th></th></tr>
    <c:forEach var="user" items="${users}">
    <tr><td><c:out value="${user.login}" /></td>
        <td><c:out value="${user.name}" /></td>
    </tr>
    </c:forEach>
</table>
<a href="/lobby">Go back</a>
</body>
</html>