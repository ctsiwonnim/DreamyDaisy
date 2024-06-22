package com.example.DreamyDaisy.controller;

import com.example.DreamyDaisy.dto.MemberDTO;
import com.example.DreamyDaisy.repository.MemberRepository;
import com.example.DreamyDaisy.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;//의존성 주입


    @GetMapping("/login")
    public String loginFrom(){
        return "login";
    }
    @GetMapping("/join")
    public String joinFrom(){
        return "join";
    }

    @PostMapping("/join")
    public String join(@ModelAttribute MemberDTO memberDTO){
        int saveResult = memberService.save(memberDTO);
        if(saveResult>0){
            return "login";//가입성공시
        }else {
            return "join";//가입실패시
        }
    }
}
