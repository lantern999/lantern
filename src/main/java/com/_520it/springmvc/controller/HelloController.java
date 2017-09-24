package com._520it.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lanter on 2017/9/21.
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("你在干嘛");
        ModelAndView mv= new ModelAndView();
        mv.addObject("msg","今天下雨");
        mv.setViewName("/index.jsp");
        return mv;
    }
}
