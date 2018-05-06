package org.karin.mentorisa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginpageController {

    @GetMapping("/loginpage")
    public String loginpage(@RequestParam(name="Email", required=false, defaultValue="World")  String name, @RequestParam(name="Password", required=false)  String password, Model model ) {
        model.addAttribute("Email", name);
        model.addAttribute("Password", password);
        return "loginpage";
    }

}



