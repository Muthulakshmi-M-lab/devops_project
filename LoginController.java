package com.course;

import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        if(username.equals("student") && password.equals("123")){
            return "success";
        }

        return "fail";
    }

}
