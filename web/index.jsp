<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 5/7/17
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form action="/LoginController" method="post">
    Name:<input type="text" name="username"/><br/><br/>
    Password:<input type="password" name="password"/><br/><br/>
    <input type="submit" value="login"/>

</form>
</body>
</html>
