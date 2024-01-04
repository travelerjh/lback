package com.example.lback.service;

import com.example.lback.Mapper.MemberMapper;
import com.example.lback.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class memberService {


    private final MemberMapper mapper;

    public void signup(Member member) {
        mapper.signup(member);
    }
}
