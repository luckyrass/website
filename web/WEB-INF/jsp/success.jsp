<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: jdan
  Date: 2016/11/30
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<body>
${successMsg } Welcome!  <shiro:principal/>
<br><br>

<shiro:hasAnyRoles name="user">
    <a href="/jsp/user.jsp">User Page</a>
</shiro:hasAnyRoles>

<br><br>

<shiro:hasAnyRoles name="admin">
    <a href="/jsp/admin.jsp">Admin Page</a>
</shiro:hasAnyRoles>

<br><br>
<a href="../test/logout.do">Logout</a>
</body>
</body>
</html>
