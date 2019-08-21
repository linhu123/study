package com.linfix.dao;

import com.linfix.pojo.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao {
    /**
     * 添加分类
     * @param category
     * @return
     */
    int addCategory(Category category);

    /**
     * 更新分类
     * @param category
     * @return
     */
    int updateCategory(Category category);

    /**
     * 返回所有的category
     * @return
     */
    List<Category> selectAllCategory();
}
