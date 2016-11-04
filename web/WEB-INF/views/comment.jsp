<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jdan
  Date: 2016/11/3
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评论</title>
    <link rel="shortcut icon" type="image/png" href="<c:url value="/resources/img/icon.png" />">
    <link href="<c:url value="/resources/css/about.css" />" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Architects+Daughter' rel='stylesheet' type='text/css'>
</head>
<body>
    <%@include file="header.jsp"%>
    <article class="aboutcon">
        <h1 class="t_nav"><span>我不是归人，是个过客</span><a href="<c:url value="/index" />" class="n1">网站首页</a><a href="#" class="n2">留言板</a></h1>
        <div class="about left">
            <!-- 多说评论框 start -->
            <div class="ds-thread" data-thread-key="${news.newsid}" data-title="${news.title}" data-url="http://localhost:8080/website/" style="margin: 50px 20px 0 0;"></div>
            <!-- 多说评论框 end -->
            <!-- 多说公共JS代码 start (一个网页只需插入一次) -->
            <script type="text/javascript">
                var duoshuoQuery = {short_name:"jdan94"};
                (function() {
                    var ds = document.createElement('script');
                    ds.type = 'text/javascript';ds.async = true;
                    ds.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') + '//static.duoshuo.com/embed.js';
                    ds.charset = 'UTF-8';
                    (document.getElementsByTagName('head')[0]
                    || document.getElementsByTagName('body')[0]).appendChild(ds);
                })();
            </script>
            <!-- 多说公共JS代码 end -->
        </div>
        <aside class="right">
            <div class="about_c">
            </div>
        </aside>
    </article>
</body>
</html>
