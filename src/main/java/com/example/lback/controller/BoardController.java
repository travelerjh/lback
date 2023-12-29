package com.example.lback.controller;

import com.example.lback.domain.Board;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/board")
public class BoardController {

    @PostMapping("add")
    public void add(@RequestBody Board board){
        System.out.println("board = " + board);
        System.out.println("잘넘어옴");


    }
    
    
}
