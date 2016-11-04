package me.jdan.service;

import me.jdan.po.Newscategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jdan on 2016/11/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml", "classpath:spring-mybatis.xml"})
public class CategoryServiceTest {
    @Resource
    private NewsCategoryService service;
    @Test
    public void insertTest() {
        Newscategory newscategory = new Newscategory();
        newscategory.setName("慢生活");
        newscategory.setDescription("慢生活是一种生活态度");
        newscategory.setFtype(0);
        service.insertNewsCategory(newscategory);
    }
    @Test
    public void selectFirstTest() {
        List<Newscategory> list = service.selectAllFirstLevelNewsCategory();
        for (Newscategory newscategory : list) {
            System.out.println(newscategory.getName());
            System.out.println(newscategory.getDescription());
        }
    }
    @Test
    public void deleteTest() {
        service.deleteNewsCategory(3);
    }
}
