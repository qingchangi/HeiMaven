package com.zhibo.hei_maven.controllers;

import com.zhibo.hei_maven.mybatis.AdminDao;
import entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 你 楠哥 。 on 2017/11/22.
 */
@Controller
public class yangController {

    @Autowired
    AdminDao adminDao;
    @RequestMapping("/tologin")
    public String tologin(Model model){
        Admin admin =new Admin();
        admin.setName("张三");
        admin.setPwd("123456");
        List<Admin> list = adminDao.selectAll(admin);
        model.addAttribute("list",list);
        return "/index";
    }
}
