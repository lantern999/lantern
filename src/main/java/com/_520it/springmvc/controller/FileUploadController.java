package com._520it.springmvc.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lanter on 2017/9/21.
 */
@Controller
public class FileUploadController  {
    @RequestMapping("/upload")
    public void fileUpload(MultipartFile file) throws IOException {
        //文件上传,先导文件上传相关的依赖
        System.out.println("文件类型"+file.getContentType());
        System.out.println("文件名称"+file.getName());
        System.out.println("文件原始名称"+file.getOriginalFilename());
        System.out.println("文件大小"+file.getSize());
        System.out.println("文件输入流"+file.getInputStream());
        //调用springmvc工具下载到指定目录
        FileOutputStream os= new FileOutputStream("D:/springMVC.xls");
        IOUtils.copy(file.getInputStream(),os);
    }
    @RequestMapping("/download")
    public void download(HttpServletResponse response) throws IOException {
       //文件下载,spring没有封装,使用的servlet 方式 设置文件名
        String fileName= new String("逗比".getBytes("utf-8"),"iso8859-1");
        //设置文件下载响应头,浏览器读取的格式是8859-1,先解码成二进制,再编码
        response.setHeader("Content-Disposition", "attachment;filename="+fileName+".jpg");
      //获取需要下载的文件输入流
        FileInputStream is = new FileInputStream("D:/22.jpg");
        //通过spring工具下载到输出流
        ServletOutputStream out = response.getOutputStream();
        IOUtils.copy(is,out);
        //关闭流
        is.close();
        out.close();

    }

}
