package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author Think
 * @Date 2020/4/1 20:30
 * @Version 1.0
 **/
@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    public String Index(){
        return "hi,this is index";

    }
}
