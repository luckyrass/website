package me.jdan.service.impl;

import me.jdan.dao.NewscategoryMapper;
import me.jdan.po.Newscategory;
import me.jdan.service.NewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jdan on 2016/11/1.
 */
@Service("newsCategoryService")
public class NewsCategoryServiceImpl implements NewsCategoryService {
    @Resource
    private NewscategoryMapper newscategoryDao;
    public void insertNewsCategory(Newscategory newscategory) {
        newscategoryDao.insert(newscategory);
    }

    public void deleteNewsCategory(int id) {
        newscategoryDao.deleteByPrimaryKey(id);
    }

    public void updateNewsCategory(Newscategory newscategory) {
        newscategoryDao.updateByPrimaryKey(newscategory);
    }

    public Newscategory selectNewsCategoryById(int id) {
        return newscategoryDao.selectByPrimaryKey(id);
    }

    public List<Newscategory> selectAllNewsCategory() {
        return newscategoryDao.selectAllNewsCategory();
    }

    public List<Newscategory> selectAllFirstLevelNewsCategory() {
        return newscategoryDao.selectAllFirstLevelNewsCategory();
    }

    public List<Newscategory> selectSubNewsCategoryBySuperId(int id) {
        return newscategoryDao.selectSubNewsCategoryBySuperId(id);
    }

    public List<Newscategory> selectCategoryByName(String name) {
        return newscategoryDao.selectCategoryByName(name);
    }
}
