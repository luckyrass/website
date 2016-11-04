package me.jdan.service;

import me.jdan.dao.NewscategoryMapper;
import me.jdan.po.Newscategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jdan on 2016/11/1.
 */
public interface NewsCategoryService {
    public void insertNewsCategory(Newscategory newscategory);
    public void deleteNewsCategory(int id);
    public void updateNewsCategory(Newscategory newscategory);
    public Newscategory selectNewsCategoryById(int id);
    public List<Newscategory> selectAllNewsCategory();
    public List<Newscategory> selectAllFirstLevelNewsCategory();
    public List<Newscategory> selectSubNewsCategoryBySuperId(int id);
    public List<Newscategory> selectCategoryByName(String name);
}
