package com.chandra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CourseController {

    @GetMapping("/course/{cname}/info")
    public String getCourseInfo(@PathVariable("cname") String cname, Model model){
//ex for path variable
        //  http://localhost:8080/course/sbms/info   (cname)
        String MsgText= cname+"Welcome to sbms course";
        model.addAttribute("msg",MsgText);
        return "index";

    }

    // Path Params
}
