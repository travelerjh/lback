package com.example.lback.Mapper;

import com.example.lback.domain.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    @Insert("""
                insert into member (id, password, email) values (#{id},#{password},#{email});
        """)
    void signup(Member member);
}
