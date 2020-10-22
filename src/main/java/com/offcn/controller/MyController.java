package com.offcn.controller;

import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.*;

@Controller
public class MyController {
    @RequestMapping("/index")
    public String index(Model model){
        System.out.println("============");
        String message = "hello thymeleaf";
        model.addAttribute("message",message);
        System.out.println("hello========s");
        System.out.println("sfs更改了输出");
        return "index";
    }

    @RequestMapping("/getUser")
    public String getUser(Model model){
        User user = new User(1,"lucy",18);
        model.addAttribute("user",user);
        Map<String,Object> map = new HashMap<>();
        map.put("src1","2.jpg");
        map.put("src2","3.jpg");
        model.addAttribute("src",map);
        return "index2";
    }

    @RequestMapping("/getUserList")
    public String getUserList(Model moder){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"lucy",18));
        list.add(new User(2,"jack",19));
        list.add(new User(3,"tom",28));
        list.add(new User(4,"tim",29));
        moder.addAttribute("userList",list);
        return "index3";
    }

    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("username","laopeng");
        model.addAttribute("href","http://www.baidu.com");
        return "index4";
    }

    @RequestMapping("/index5")
    public String index5(Model model){
        model.addAttribute("result","y");
        model.addAttribute("menu","manager");
        model.addAttribute("manager","manager");
        return "index5";
    }

    @RequestMapping("index6")
    public String index6(){
        System.out.println("样式");
        return "index6";
    }

    @RequestMapping("index7")
    public String index7(Model model){
        //日期
        Date date = new Date();
        model.addAttribute("date",date);
        //数字格式化
        model.addAttribute("number",1234.5678);
        //字符串的
        String str = "2020-10-22 11:50:53.342  INFO 8932 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'\n" +
                "2020-10-22 11:50:53.343  INFO 8932 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'\n" +
                "2020-10-22 11:50:53.349  INFO 8932 --- [nio-8080-exec-1] o.s.web.servlet.Disp";
        model.addAttribute("str",str);
        //字符串截取
        String str2 = "java-offcn-0615";
        model.addAttribute("str2",str2);

        return "index7";
    }
}
