<%--
  Created by IntelliJ IDEA.
  User: jdan
  Date: 2016/11/3
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
    <title>${news.title}</title>
    <link rel="shortcut icon" type="image/png" href="<c:url value="/resources/img/icon.png" />">
</head>
<body>
    <%@include file="header.jsp"%>
    <link href="<c:url value="/resources/css/new.css" />" rel="stylesheet">

    <article class="blogs">
        <h1 class="t_nav"><span>您当前的位置：<a href="<c:url value="/index" />">首页</a>&nbsp;&gt;&nbsp;<a href="<c:url value="${categoryMap.firstCategoryUrl}" />">${categoryMap.firstCategoryName}</a>&nbsp;&gt;&nbsp;<a href="<c:url value="${categoryMap.secondCategoryUrl}" />">${categoryMap.secondCategoryName}</a></span><a href="<c:url value="/index" />" class="n1">网站首页</a><a href="<c:url value="${categoryMap.secondCategoryUrl}" />" class="n2">${categoryMap.secondCategoryName}</a></h1>
        <div class="index_about">
            <h2 class="c_titile">${news.title}</h2>
            <p class="box_c"><span class="d_time">发布时间：<fmt:formatDate value="${news.releasedate}" type="date"/></span><span>编辑：${news.authorname}</span></p>
            <ul class="infos">
                ${content}
            </ul>
            <div class="keybq">
                <p><span>关键字词</span>：${news.keywords}</p>
            </div>
<%--            <div class="nextinfo">
                <p>上一篇：[!--info.pre--]</p>
                <p>下一篇：[!--info.next--]</p>
            </div>
            <div class="otherlink">
                <h2>相关文章</h2>
                <ul>
                    [!--other.link--]
                </ul>
            </div>--%>
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
            <!-- Baidu Button BEGIN -->
            <div id="bdshare" class="bdshare_t bds_tools_32 get-codes-bdshare"><a class="bds_tsina"></a><a class="bds_qzone"></a><a class="bds_tqq"></a><a class="bds_renren"></a><span class="bds_more"></span><a class="shareCount"></a></div>
            <script type="text/javascript" id="bdshare_js" data="type=tools&amp;uid=6574585" ></script>
            <script type="text/javascript" id="bdshell_js"></script>
            <script type="text/javascript">
                document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000)
            </script>
            <!-- Baidu Button END -->
            <div class="blank"></div>
            <div class="news">
                <h3>
                    <p>栏目<span>最新</span></p>
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
        </aside>
    </article>

</body>
</html>
