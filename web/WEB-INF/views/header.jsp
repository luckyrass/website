<%--
  Created by IntelliJ IDEA.
  User: jdan
  Date: 2016/10/29
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>个人博客</title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <link href="<c:url value="/resources/css/base.css" />" rel="stylesheet">
</head>
<body>
    <header>
        <div id="logo"><a href="/"></a></div>
        <nav class="topnav" id="topnav">
            <a href="<c:url value="/index" />"><span>首页</span><span class="en">Protal</span></a>
            <a href="<c:url value="/study" />"><span>学无止境</span><span class="en">Learn</span></a><a href="<c:url value="/life" />"><span>慢生活</span><span class="en">Life</span></a><a href="<c:url value="/about" />"><span>关于我</span><span class="en">About</span></a><a href="<c:url value="/comment" />"><span>留言版</span><span class="en">Gustbook</span></a>
        </nav>
    </header>

    <!-- <footer>
        <p>Design by DanceSmile,cite by jdan <a href="#" target="_blank"></a> <a href="/">网站统计</a></p>
    </footer> -->
    <script src="resources/js/silder.js"></script>
</body>
</html>
