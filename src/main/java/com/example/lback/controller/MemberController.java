package com.example.lback.controller;


import com.example.lback.domain.Member;
import com.example.lback.service.memberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/member/")
@RestController
public class MemberController {


    private final memberService serivce;

    @PostMapping("signup")
    public void signup(@RequestBody Member member){
        serivce.signup(member);

    }




}
