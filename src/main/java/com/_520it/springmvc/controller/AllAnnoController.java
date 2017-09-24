package com._520it.springmvc.controller;

import com._520it.springmvc.domain.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lanter on 2017/9/21.
 */
@Controller
public class AllAnnoController {
    @RequestMapping("/anno2")
    public ModelAndView method(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("你想干1111嘛");
        return null;
    }
    @RequestMapping("/anno3")
    public ModelAndView method1(User u) throws Exception {
        System.out.println(u);
        return null;
    }
    @RequestMapping("/anno4")
    public ModelAndView method4(User u) throws Exception {
        System.out.println(u);
        return null;
    }
    @InitBinder
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}
