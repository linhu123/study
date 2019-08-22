package com.linfix.controller;

import com.linfix.dto.ResponseDto;
import com.linfix.pojo.Category;
import com.linfix.service.BlogService;
import com.linfix.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/editBlog")
    public String edit(){
        System.out.println("edit");
        return "/back/blogEdit";
    }
    @RequestMapping(value = "/addCategory")
    @ResponseBody
    public ResponseDto add(Category category){
        if (blogService.addBlog(category)) return ResponseDto.successWithData("");
        return ResponseDto.failWithMessage("新增博客分类失败");
    }

    @RequestMapping(value = "/allCategory")
    @ResponseBody
    public ResponseDto selectAllCategory(){
        List<Category> categories = categoryService.selectAllCategory();
        if (!categories.isEmpty()){
            return ResponseDto.successWithData(categories);
        }
        return ResponseDto.failWithMessage("查询博客分类失败");
    }

}
