<%--
  Created by IntelliJ IDEA.
  User: jdan
  Date: 2016/10/29
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
    <title>${categoryName}</title>
    <link rel="shortcut icon" type="image/png" href="<c:url value="/resources/img/icon.png" />">
</head>
<body>
    <%@include file="header.jsp"%>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

    <article class="blogs">
        <h1 class="t_nav"><span>follow your heart</span><a href="<c:url value="/index" />" class="n1">网站首页</a><a href="<c:url value="/life" />" class="n2">${categoryName}</a></h1>
        <div class="newblog left">
            <c:forEach var="news" items="${newsList}">
                <div>
                    <h2>${news.title}</h2>
                    <p class="dateview"><span>发布时间：<fmt:formatDate value="${news.releasedate}" type="date"/></span><span>作者：${news.authorname}</span><span>分类：[ <a href="#">${news.categoryname}</a> ]</span></p>
                    <%--<figure><img src="images/01.jpg"></figure>--%>
                    <ul class="nlist">
                        <p>${news.newsintro}</p>
                        <a title="/" href="<c:url value="/detailPage?id=${news.newsid}" />" target="_blank" class="readmore">阅读全文>></a>
                    </ul>
                    <div class="line"></div>
                </div>
            </c:forEach>
            <div class="blank"></div>
        </div>
        <aside class="right">
            <div class="rnav">
                <ul>
                    <li class="rnav1"><a href="<c:url value="/detailLife?type=日记" />" target="_blank">日记</a></li>
                    <li class="rnav2"><a href="<c:url value="/detailLife?type=读书" />" target="_blank">读书</a></li>
                    <li class="rnav3"><a href="<c:url value="/detailLife?type=程序人生" />" target="_blank">程序人生</a></li>
                    <li class="rnav4"><a href="<c:url value="/detailLife?type=经典语录" />" target="_blank">经典语录</a></li>
                </ul>
            </div>
            <div class="news">
                <h3>
                    <p>最新<span>文章</span></p>
                </h3>
                <ul class="rank">
                    <c:forEach var="news" items="${recentNewsList}">
                        <li><a href="<c:url value="/detailPage?id=${news.url}" />" title="${news.title}" target="_blank">${news.title}</a></li>
                    </c:forEach>
                </ul>
                <h3 class="ph">
                    <p>点击<span>排行</span></p>
                </h3>
                <ul class="paih">
                    <c:forEach var="news" items="${recentNewsList}">
                        <li><a href="<c:url value="/detailPage?id=${news.url}" />" title="${news.title}" target="_blank">${news.title}</a></li>
                    </c:forEach>
                </ul>
            </div>
            <!-- Baidu Button BEGIN -->
            <div id="bdshare" class="bdshare_t bds_tools_32 get-codes-bdshare"><a class="bds_tsina"></a><a class="bds_qzone"></a><a class="bds_tqq"></a><a class="bds_renren"></a><span class="bds_more"></span><a class="shareCount"></a></div>
            <script type="text/javascript" id="bdshare_js" data="type=tools&amp;uid=6574585" ></script>
            <script type="text/javascript" id="bdshell_js"></script>
            <script type="text/javascript">
                document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000)
            </script>
            <!-- Baidu Button END -->
        </aside>
    </article>
</body>
</html>
