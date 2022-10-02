package com.danilov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }
    @RequestMapping("askName")
    public String askNamedetails()
    {
        return "ask-name-view";
    }
    @RequestMapping("showDetails")
    public String showName(){
        return "show-name-details-view";
    }
}
