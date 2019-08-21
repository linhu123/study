package com.linfix.controller;

import com.linfix.pojo.Category;
import com.linfix.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping(value = "/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/edit")
    public String edit(){
        System.out.println("edit");
        return "/back/blogEdit";
    }
    @RequestMapping(value = "add")
    @ResponseBody
    public String add(Category category){
        return "";
    }

}
