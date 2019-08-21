package com.linfix.service;

import com.linfix.pojo.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class CategoryServiceTest {
    @Autowired
    private CategoryService categoryService;

    @Test
    public void addCategory() throws Exception {
        Category category = new Category();
        category.setCategoryName("JAVA");
        category.setCategoryDes("the king of web");
        category.setCategoryLevel(1);
        boolean result = categoryService.addCategory(category);
        Assert.assertTrue(result);
    }


}
