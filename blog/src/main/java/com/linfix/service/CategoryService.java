package com.linfix.service;

import com.linfix.dao.CategoryDao;
import com.linfix.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
