package com._520it.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lanter on 2017/9/21.
 */
@Controller
public class AnnoController {
    @RequestMapping("/anno")
    public ModelAndView method(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("你想干嘛");
        return null;
    }
    @RequestMapping("/anno1")
    public ModelAndView method1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("今天是星期天");
        return null;
    }
}
