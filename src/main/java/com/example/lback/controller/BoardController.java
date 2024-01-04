package com.example.lback.controller;

import com.example.lback.domain.Board;
import com.example.lback.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {

    private final BoardService service;

    @PostMapping("add")
    public ResponseEntity add(@RequestBody Board board) {

        if (!service.validate(board)){
            return  ResponseEntity.badRequest().build();
        }


        if (service.save(board)) {
            return     ResponseEntity.ok().build();
        } else {
          return    ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("list")
    public List<Board> list(){
        return service.list();
    }



    @GetMapping("id/{id}")
    public Board get(@PathVariable Integer id){
        return  service.get(id);
    }


    @DeleteMapping("remove/{id}")
    public ResponseEntity remove(@PathVariable Integer id){
        if (service.remove(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }


    @PutMapping("edit")
    // 프론트에서 정보를 받는건  @RequestBody
    // 서버에서 정보를 주는건 @ResponseBody
    public ResponseEntity update(@RequestBody Board board  ){
        System.out.println("board = " + board);
        if( service.update(board)){
return  ResponseEntity.ok().build();
        }else {
            return ResponseEntity.badRequest().build();
        }

    }






}