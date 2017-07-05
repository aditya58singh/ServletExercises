<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 5/7/17
  Time: 5:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1> Welcome To Blog Page</h1>
<form action="/bloginput" method="post">
   Blog ID :<input type="text" name="blogid"/><br/><br/>
    Blog Content :<input type="text" name="blogcontent"/><br/><br/>
    <input type="submit" value="Save"/>
</form>
</body>
</html>
