package com.example.lback.service;

import com.example.lback.Mapper.BoardMapper;
import com.example.lback.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper mapper;


    public boolean save(Board board) {
        return mapper.insert(board) == 1;
    }

    public boolean validate(Board board){
        if (board == null) {
            return false;
        }

        if (board.getContent()==null || board.getContent().isBlank()){
            return false;
        }
        if ( board.getWriter()==null||board.getWriter().isBlank()){
            return false;
        }
        if ( board.getTitle()==null || board.getTitle().isBlank()){
            return false;
        }
        return true;
    }


    public Board get(Integer id) {
        return mapper.get(id);
    }

    public boolean remove(Integer id) {
        return mapper.remove(id) ==1;
    }

    public List<Board> list() {
        return mapper.list();
    }

    public boolean update(Board board) {
    return     mapper.update(board) ==1;
    }
}
