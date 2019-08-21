package com.linfix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/back")
public class BackController {
    @RequestMapping(value = "/admin")
    public String admin(){
        return "/back/admin";
    }
}
