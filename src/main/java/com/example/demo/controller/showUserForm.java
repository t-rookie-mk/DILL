package com.example.demo.controller;

import com.example.demo.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class showUserForm {

    @GetMapping("/index")
    public String show(Model model)
    {
        ArrayList arrayList = new ArrayList();
        arrayList.add("你是猪？");
        arrayList.add("你是猪.");
        arrayList.add("你是猪!");
        model.addAttribute("msg","冲！");
        model.addAttribute("lists",arrayList);
        model.addAttribute("user",new user());
        System.out.println(arrayList);
        return "index";
    }

    @PostMapping("/submit")
    @ResponseBody
    public user processForm(user u)
    {
        System.out.println(u);
        u.setId(2);
        return u;
//        return "bnuzhidao";
    }
}
