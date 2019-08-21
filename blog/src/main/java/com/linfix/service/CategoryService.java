package com.linfix.service;

import com.linfix.dao.CategoryDao;
import com.linfix.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
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
        return categories;
    }
}
