package com.springapp.MySpringApp.controller;

import org.springframework.stereotype.Controller;
// import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;
// import org.springframework.web.bind.annotation.RestController;
// import java.io.IOException;

import com.springapp.MySpringApp.model.LoginUser;
import com.springapp.MySpringApp.model.User;

// import io.micrometer.observation.transport.RequestReplySenderContext;

@Controller
public class MyController {
    // @GetMapping("/hello")
    // public ModelAndView extractLabels(String name, ModelMap map) {
    // map.addAttribute("name", name);
    // return new ModelAndView("hello", map);
    // }
    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

    @PostMapping("/home")
    public String getHome(@ModelAttribute LoginUser referncevarible) {
        System.out.println(referncevarible);
        return "home";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "about";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "Contact";
    }

    @PostMapping("/login")
    public String getLogin(@ModelAttribute User a) {

        System.out.println(a);

        return "login";
    }

}
