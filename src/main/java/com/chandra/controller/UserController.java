package com.chandra.controller;

import com.chandra.binding.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
@GetMapping("/")
    public String loadForm(Model model){
        User userObj=new User();
        model.addAttribute("user" ,userObj);
        return "Userindex";
    }
    
@PostMapping("/user")
    public String HandleSubmitButton(User user,Model model){
    System.out.println(user);
    model.addAttribute("msg","USer Data saved successfully ");
        return "Success";
    }
}
