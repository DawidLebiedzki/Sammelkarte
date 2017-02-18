package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/add-user")
        public String addUser(){
            return "add-user";
        }

    @RequestMapping("/add-scrap")
    public String addScrap(){
        return "add-scrap";
    }
}
