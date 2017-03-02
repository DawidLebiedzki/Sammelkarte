package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all-users", method = RequestMethod.GET)
    public List<User> showAllUsers(User user, Model model){
        model.addAttribute("users", userService.findAll());
        return userService.findAll();
    }

    @RequestMapping(value = "/delete/{id}")
    public List<User> deleteUser(@PathVariable int id, @ModelAttribute User user, Model model){
        userService.delete(id);
        model.addAttribute("users", userService.findAll());
        return userService.findAll();
    }
}
