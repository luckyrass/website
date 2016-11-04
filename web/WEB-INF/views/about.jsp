<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jdan
  Date: 2016/11/3
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>关于我们</title>
    <link rel="shortcut icon" type="image/png" href="<c:url value="/resources/img/icon.png" />">
    <link href="<c:url value="/resources/css/about.css" />" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Architects+Daughter' rel='stylesheet' type='text/css'>
</head>
<body>
<%@include file="header.jsp"%>
<article class="aboutcon">
    <h1 class="t_nav"><span>Simple is best</span><a href="<c:url value="/index" />" class="n1">网站首页</a><a href="#" class="n2">关于我</a></h1>
    <div class="about left">
        <h2>Just about me</h2>
        <ul>
            <pre>
我打江南走过
那等在季节里的容颜如莲花的开落
东风不来，三月的柳絮不飞
你的心是小小的寂寞的城
恰若青石的街道向晚
足音不响， 三月的春帷不揭
你的心是小小的窗扉紧掩
我哒哒的马蹄声是美丽的错误
我不是归人，是个过客
            </pre>
        </ul>
        <br><br>
        <h2>About my blog</h2>
        <p>域  名：www.jdan.me 创建于2016年09月12日 </p>
        <p>服务器：腾讯云服务器</p>
        <p>备案号：无</p>
        <p>程  序：JSP</p>
    </div>
    <aside class="right">
        <div class="about_c">
            <p>网名：<span>LCKY</span></p>
            <p>职业：现役研究僧</p>
            <p>喜欢的书：《解忧杂货店》《三体》</p>
            <p>邮箱：luckyrass@163.com</p>
        </div>
    </aside>
</article>
<footer>
    <p>Design by DanceSmile, cited by jdan</p>
</footer>
</body>
</html>
