package me.jdan.service.impl;

import me.jdan.dao.NewsMapper;
import me.jdan.po.News;
import me.jdan.po.ShortNews;
import me.jdan.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jdan on 2016/10/31.
 */
@Service("newsService")
public class NewsServiceImpl implements NewsService{
    @Resource
    private NewsMapper newsDao;
    public void insertNews(News news) {
        newsDao.insert(news);
    }

    public void deleteNewsByNewsId(String newsId) {
        newsDao.deleteByPrimaryKey(newsId);
    }

    public void updateNews(News news) {
        newsDao.updateByPrimaryKey(news);
    }

    public News selectNewsByNewsId(String newsId) {
        return newsDao.selectByPrimaryKey(newsId);
    }

    public List<ShortNews> selectAllShortNews() {
        return newsDao.selectAllShortNews();
    }

    public List<ShortNews> selectAllPublicShortNews() {
        return newsDao.selectAllPublicShortNews();
    }

    @Override
    public List<ShortNews> selectAllShortNewsByCategoryId(int id) {
        return newsDao.selectAllShortNewsByCategoryId(id);
    }

    @Override
    public List<ShortNews> selectAllPublicShortNewsByCategoryId(int id) {
        return newsDao.selectAllPublicShortNewsByCategoryId(id);
    }

    public int selectNewsCount() {
        return 0;
    }
}
