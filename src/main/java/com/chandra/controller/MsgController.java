package com.chandra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MsgController {
@GetMapping("/greet")
    public String MsgGreet(@RequestParam("name") String name, Model model){

        String MsgText="Good Morning !!!!" +name;

        model.addAttribute("msg",MsgText);
//aceesing the above msg we can hit this below url
    //http://localhost:8080/greet?name=Chandra    ------------->query param
        return "index";
    }
@GetMapping("/enquiry")
    public String getInfo(@RequestParam("Course") String Course,
                          @RequestParam("trainer")String trainer, Model model){
//syntax acess two param here how we define
//URL //http://localhost:8080/enquiry?Course=sbms&trainer=chandra     //display contact
    //model attribute always stores key value pair

    System.out.println("Course"+Course);
    System.out.println("trainer"+trainer);
    String msgText="Started a "+ Course + "and" + trainer;
    model.addAttribute("msg",msgText);
     return "index";
    }
}
