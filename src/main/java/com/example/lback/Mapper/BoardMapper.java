package com.example.lback.Mapper;

import com.example.lback.domain.Board;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {


    @Insert("""
            insert into board (title,content,writer) 
            values (#{title},#{content},#{writer});
            """)
    int insert(Board board);


    @Select("""
                    select * from board where id=#{id};
    """)
    Board get(Integer id);

    @Delete("""
                delete from board where id=#{id};
        """)
    int remove(Integer id);

    @Select("""
                    select * from board order by id;
    """)
    List<Board> list();

    @Update("""
                    update board set title=#{title},content=#{content},writer=#{writer}   where  id= #{id};
        """)
    int update(Board board);
}
