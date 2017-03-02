package controller;

import model.User;
import model.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

   @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String showAllUsers(){
//        model.addAttribute("users", userService.findAll());
        return "/user/all";
    }

    @RequestMapping(value = "/add-user", method = RequestMethod.GET)
    public String showForm(User user){

        return "/user/add-user";
    }

    @RequestMapping(value = "/add-user", method = RequestMethod.POST)
    public String saveCreatedUser(@Valid User user, BindingResult bindingResult, Model model)throws Exception{
        if(bindingResult.hasErrors()){
            return "/user/add-user";
        }else {
            if(userService.exists(user.getUsername())){
                return "/exist";
            }
            else {
                user.setPassword(passwordEncoder.encode(user.getPassword()));
                userService.save(user);
                model.addAttribute("users", userService.findAll());
                return "/user/all-users";
            }
        }
    }

    /*@RequestMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable int id, @ModelAttribute User user, Model model){
        userService.delete(id);
        model.addAttribute("users", userService.findAll());
        return "/user/all-users";
    }*/

}
