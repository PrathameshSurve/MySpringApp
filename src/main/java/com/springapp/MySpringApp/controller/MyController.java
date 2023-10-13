package com.springapp.MySpringApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springapp.MySpringApp.model.LoginUser;
import com.springapp.MySpringApp.model.User;
import com.springapp.MySpringApp.service.UserServiceIMPL;

@Controller
public class MyController {

    @Autowired
    UserServiceIMPL service;

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @GetMapping("/signup")
    public String getIndex() {
        return "signup";
    }

    @PostMapping("/login")
    public String getLogin(@ModelAttribute User a) {
        service.addUser(a);
        System.out.println(a);
        System.out.println("User added successfully!");

        return "login";
    }

    @PostMapping("/bloghome")
    public String getBlogHome(@ModelAttribute LoginUser referncevarible) {
        System.out.println(referncevarible);
        return "bloghome";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "about";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "Contact";
    }

}
