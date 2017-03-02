package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UserService;

@Controller
public class ViewController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    // Login form with error
    @RequestMapping("/login-error.html")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login.html";
    }

    @RequestMapping(value = "/logout")
    public String logout(){
        return "logout";
    }

    @RequestMapping(value = "/403")
    public String accesDenied(){
        return "403";
    }



}
