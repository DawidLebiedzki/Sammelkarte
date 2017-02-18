package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import model.User;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRestController {

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String showForm(User userForm){
        return "userform";
    }


}
