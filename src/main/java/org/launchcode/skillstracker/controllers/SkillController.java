package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillController {
    @GetMapping("form")
    public String skillController(){
        return "<html>" +
                "<body>" +
                "<form method='POST' action=''>" +
                "<label for='name'>Name</label>" +
                "<input type='text' name='name'>Name</input>" +
                "<input type='submit' value='submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @PostMapping("form")
    public String formController(@RequestParam String name){
        return name;
    }
}
