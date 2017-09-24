package com._520it.springmvc.controller;

import com._520it.springmvc.domain.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lanter on 2017/9/21.
 */
@Controller
public class JsonController {
    @RequestMapping("/json")
    @ResponseBody
    public User method1 (){
//        贴上@ResponseBody 由response 控制,不由spring控制,返回json字符串
        return new User("小明",18,new Date());
    }
    @InitBinder
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}
