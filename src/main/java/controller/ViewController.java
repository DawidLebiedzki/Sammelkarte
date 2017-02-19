package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/user/add-user")
        public String addUser(){
            return "/user/add-user";
        }

    @RequestMapping("/scrap/add-scrap")
    public String addScrap(){
        return "/scrap/add-scrap";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/logout")
    public String logout(){
        return "logout";
    }


}
