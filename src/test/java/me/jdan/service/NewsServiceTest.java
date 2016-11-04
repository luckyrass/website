package me.jdan.service;

import me.jdan.po.News;
import me.jdan.po.ShortNews;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by jdan on 2016/11/2.
 */
/*
*CREATE TABLE news (
`newsId`  varchar(255) NOT NULL DEFAULT '' ,
`title`  varchar(255) NOT NULL ,
`keywords`  varchar(100) ,
`authorId`  varchar(255) ,
`authorName`  varchar(255) ,
`releaseDate`  datetime NOT NULL ,
`newsIntro`  varchar(4000) ,
`newsContent`  blob ,
`newsType`  int NOT NULL ,
`categoryName` varchar(50) NOT NULL ,
`privilege`  int NOT NULL DEFAULT 0 ,
PRIMARY KEY (`newsId`)
);
* */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml", "classpath:spring-mybatis.xml"})
public class NewsServiceTest {
    @Resource
    private NewsService newsService;

    @Test
    public void insertTest() {
        News news = new News();
        news.setNewsid(UUID.randomUUID().toString());
        news.setTitle("test3");
        news.setAuthorid("67ac99c6-bcfb-4578-9418-56849a5bdda3");
        news.setAuthorname("jdan");
        news.setReleasedate(new Date());
        news.setNewsintro("this is a brief introduction");
        news.setNewscontent("this is a detail page".getBytes());
        news.setNewstype(2);
        news.setCategoryname("慢生活");
        news.setPrivilege(0);
        newsService.insertNews(news);
    }

    @Test
    public void selectAllTest() {
        List<ShortNews> newses = newsService.selectAllShortNews();
        for (ShortNews news : newses) {
            System.out.println(news.getTitle());
        }
    }

    @Test
    public void selectAllPublicTest() {
        List<ShortNews> newses = newsService.selectAllPublicShortNews();
        for (ShortNews news : newses)
            System.out.println(news.getTitle());
    }

    @Test
    public void selectTest() {
        List<ShortNews> newses = newsService.selectAllPublicShortNewsByCategoryId(2);
        if (newses == null) System.out.println("Empty");
        for (ShortNews news : newses)
            System.out.println(news.getTitle());
    }

    @Test
    public void selectByTypeTest() {
        List<ShortNews> newses = newsService.selectAllPublicShortNewsByCategoryId(5);
        System.out.println("size = " + newses.size());
    }

}
