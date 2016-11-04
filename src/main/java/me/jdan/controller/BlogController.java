package me.jdan.controller;

import com.sun.tools.javac.util.Pair;
import me.jdan.po.News;
import me.jdan.po.Newscategory;
import me.jdan.po.ShortNews;
import me.jdan.service.NewsCategoryService;
import me.jdan.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by jdan on 2016/11/2.
 */
@Controller
public class BlogController {
    private static final Logger LOG = LoggerFactory.getLogger(BlogController.class);
    @Resource
    NewsService newsService;
    @Resource
    NewsCategoryService newsCategoryService;

    @RequestMapping("/index")
    public String index(Model model) {
        List<ShortNews> shortNewses = newsService.selectAllPublicShortNews();
        List<Map<String, String>> recentNews = new ArrayList<>();
        for (int i = 0; i < shortNewses.size() && i < 5; i++) {
            Map<String, String> tMap = new HashMap<>();
            tMap.put("title", shortNewses.get(i).getTitle());
            tMap.put("url", shortNewses.get(i).getNewsid());
            recentNews.add(tMap);
        }
        model.addAttribute("newsList", shortNewses);
        model.addAttribute("recentNewsList", recentNews);
        return "homepage";
    }

    @RequestMapping("/study")
    public String study(Model model) {
        int id = 1;
        String name = "学无止境";
        List<Newscategory> categories = newsCategoryService.selectSubNewsCategoryBySuperId(id);
        List<ShortNews> shortNewses = new ArrayList<>();
        for (Newscategory category : categories) {
            int sId = category.getTypeid();
            List<ShortNews> list = newsService.selectAllPublicShortNewsByCategoryId(sId);
            if (list != null && !list.isEmpty()) {
                shortNewses.addAll(list);
            }
        }
        List<Map<String, String>> recentNews = new ArrayList<>();
        for (int i = 0; i < shortNewses.size() && i < 5; i++) {
            Map<String, String> tMap = new HashMap<>();
            tMap.put("title", shortNewses.get(i).getTitle());
            tMap.put("url", shortNewses.get(i).getNewsid());
            recentNews.add(tMap);
        }
        model.addAttribute("newsList", shortNewses);
        model.addAttribute("recentNewsList", recentNews);
        model.addAttribute("categoryName", name);
        return "study";
    }

    @RequestMapping("/detailStudy")
    public String detailStudy(Model model, @RequestParam(value = "type", required = true) String categoryName) {
        String name = categoryName;
        int id  = newsCategoryService.selectCategoryByName(name).get(0).getTypeid();
        List<ShortNews> shortNewses = newsService.selectAllPublicShortNewsByCategoryId(id);
        List<Map<String, String>> recentNews = new ArrayList<>();
        for (int i = 0; i < shortNewses.size() && i < 5; i++) {
            Map<String, String> tMap = new HashMap<>();
            tMap.put("title", shortNewses.get(i).getTitle());
            tMap.put("url", shortNewses.get(i).getNewsid());
            recentNews.add(tMap);
        }
        model.addAttribute("newsList", shortNewses);
        model.addAttribute("recentNewsList", recentNews);
        model.addAttribute("categoryName", name);
        return "study";
    }

    @RequestMapping("/life")
    public String life(Model model) {
        int id = 2;
        String name = "慢生活";
        List<Newscategory> categories = newsCategoryService.selectSubNewsCategoryBySuperId(id);
        List<ShortNews> shortNewses = new ArrayList<>();
        for (Newscategory category : categories) {
            int sId = category.getTypeid();
            List<ShortNews> list = newsService.selectAllPublicShortNewsByCategoryId(sId);
            if (list != null && !list.isEmpty()) {
                shortNewses.addAll(list);
            }
        }
        List<Map<String, String>> recentNews = new ArrayList<>();
        for (int i = 0; i < shortNewses.size() && i < 5; i++) {
            Map<String, String> tMap = new HashMap<>();
            tMap.put("title", shortNewses.get(i).getTitle());
            tMap.put("url", shortNewses.get(i).getNewsid());
            recentNews.add(tMap);
        }
        model.addAttribute("newsList", shortNewses);
        model.addAttribute("recentNewsList", recentNews);
        model.addAttribute("categoryName", name);
        return "life";
    }

    @RequestMapping("/detailLife")
    public String detailLife(Model model, @RequestParam(value = "type", required = true) String categoryName) {
        String name = categoryName;
        int id  = newsCategoryService.selectCategoryByName(name).get(0).getTypeid();
        List<ShortNews> shortNewses = newsService.selectAllPublicShortNewsByCategoryId(id);
        List<Map<String, String>> recentNews = new ArrayList<>();
        for (int i = 0; i < shortNewses.size() && i < 5; i++) {
            Map<String, String> tMap = new HashMap<>();
            tMap.put("title", shortNewses.get(i).getTitle());
            tMap.put("url", shortNewses.get(i).getNewsid());
            recentNews.add(tMap);
        }
        model.addAttribute("newsList", shortNewses);
        model.addAttribute("recentNewsList", recentNews);
        model.addAttribute("categoryName", name);
        return "life";
    }

    @RequestMapping("detailPage")
    public String detailPage(Model model, @RequestParam(value = "id", required = true) String newsId) {
        News news = newsService.selectNewsByNewsId(newsId);
        Newscategory secondCategory = newsCategoryService.selectNewsCategoryById(news.getNewstype());
        Newscategory firstCategory = newsCategoryService.selectNewsCategoryById(secondCategory.getFtype());
        List<ShortNews> shortNewses = newsService.selectAllPublicShortNewsByCategoryId(secondCategory.getTypeid());
        List<Map<String, String>> recentNews = new ArrayList<>();
        for (int i = 0; i < shortNewses.size() && i < 5; i++) {
            Map<String, String> tMap = new HashMap<>();
            tMap.put("title", shortNewses.get(i).getTitle());
            tMap.put("url", shortNewses.get(i).getNewsid());
            recentNews.add(tMap);
        }
        Map<String, String> categoryMap = new HashMap<>();
        String firstCategoryName = firstCategory.getName();
        String secondCategoryName = secondCategory.getName();
        categoryMap.put("firstCategoryName", firstCategoryName);
        categoryMap.put("secondCategoryName", secondCategoryName);
        if (firstCategoryName.equals("学无止境")) {
            categoryMap.put("firstCategoryUrl", "/study");
            categoryMap.put("secondCategoryUrl", "/detailStudy?type=" + secondCategoryName);
        }else {
            categoryMap.put("firstCategoryUrl", "/life");
            categoryMap.put("secondCategoryUrl", "/detailLife?type=" + secondCategoryName);
        }
        String content = new String(news.getNewscontent());
        model.addAttribute("news", news);
        model.addAttribute("content", content);
        model.addAttribute("categoryMap", categoryMap);
        model.addAttribute("recentNewsList", recentNews);
        return "news";
    }
    @RequestMapping("/about")
    public String about(Model model) {
        return "about";
    }

    @RequestMapping("/comment")
    public String comment(Model model) {
        return "comment";
    }
}
