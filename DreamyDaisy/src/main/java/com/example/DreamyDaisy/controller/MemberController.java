package com.example.DreamyDaisy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/login")
    public String loginFrom(){
        return "login";
    }
    @GetMapping("/join")
    public String joinFrom(){
        return "join";
    }
}
