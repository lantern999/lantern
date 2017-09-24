package com._520it.springmvc.controller;

import com._520it.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by lanter on 2017/9/21.
 */
@Controller
public class ValueController {
    @RequestMapping("/value1")
    public ModelAndView method1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("你想干1111嘛");
        ModelAndView mv =new ModelAndView();
        mv.addObject("msg","是否要重定向");
        mv.setViewName("/index.jsp");
        return mv;
    }
    @RequestMapping("/value2")
    public User method2() throws Exception {
       return new User("夏明",18,new Date());
    }
    @RequestMapping("/value3")
    public String method3(){
        //返回字符串时,拼接的地址不是url名,而是返回的字符串名
        return "小明";
    }
    @RequestMapping("/value4")
    public String method4(Model model){
        //传输数据通过model的对象存取
        System.out.println("拦截器你要来了没");
        model.addAttribute("msg","我就是传输的数据");
        return "new";
    }
    @RequestMapping("/value5")
    public String method5(Model model){
        //转发到跟目录,通过forward请求转发
        model.addAttribute("msg","我就是传输的数据");
        return "forward:/index.jsp";
    }
    @RequestMapping("/value6")
    public String method6(Model model){
        //转发到跟目录,通过redirect重定向,将值拼到请求行,有字数限定,有缓存
        model.addAttribute("msg","我就是传输的数据");
        return "redirect:/index.jsp";
    }
}
