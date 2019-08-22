package com.linfix.service;

import com.linfix.dao.CategoryDao;
import com.linfix.pojo.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private static final Logger LOG = LoggerFactory.getLogger(CategoryService.class);
    @Autowired
    private CategoryDao categoryDao;

    /**
     *  添加category
     * @param category
     * @return
     */
    public boolean addCategory(Category category){
        int colum = categoryDao.addCategory(category);
        if(colum < 1)return false;
        return true;
    }

    public List<Category> selectAllCategory(){
        List<Category> categories = categoryDao.selectAllCategory();
        LOG.info("得到category is {}",categories);
        return categories;
    }
}
