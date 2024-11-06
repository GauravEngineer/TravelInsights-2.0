package com.alextechsolutions.travelinsightsversion2_1.Controller;

import com.alextechsolutions.travelinsightsversion2_1.Model.Users;
import com.alextechsolutions.travelinsightsversion2_1.Service.Registration_Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        return "redirect:/html/homePage.html";
    }

    @Autowired
    private Registration_Process register;
    @PostMapping("/register_process")
    public String registration(@ModelAttribute Users user){
        System.out.println(user);
        register.register(user);
        return "redirect:/html/login.html";
    }

}
