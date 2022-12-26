<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome!</title>
</head>
<body>
<form method="post" >
    <input type="text" name="login"  placeholder="input login" class="form-control"><br>
    <input type="text" name="password" placeholder="input password" class="form-control"><br>
    <button type="submit" class="btn btn-success">Log-in</button>
    <c:out value="${error}" />
</form>
</body>
</html>