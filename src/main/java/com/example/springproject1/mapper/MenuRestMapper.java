package com.example.springproject1.mapper;

import com.example.springproject1.entity.Menu;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface MenuRestMapper {
    @Select("select idx, memID, title, content, writer, indate, count FROM backend_spring_project.menu ORDER BY idx DESC ")
    public List<Menu> getLists();
    @Insert("INSERT INTO backend_spring_project.menu(memID, title, content, writer, indate) VALUES (#{memID},#{title},#{content},#{writer},#{indate})")
    public void boardInsert(Menu menu);
    @Select("select idx, memID, title, content, writer, indate, count FROM backend_spring_project.menu WHERE idx=${idx}")
    public Menu boardContent(int idx);
    @Delete("delete from backend_spring_project.menu where idx=#{idx}")
    public void boardDelete(int idx);
    @Update("update backend_spring_project.menu set title=#{title},content=#{content},writer=#{writer} where idx=#{idx}")
    public void boardUpdate(Menu menu);
    @Update("update backend_spring_project.menu set count = count+1 where idx=#{idx}")
    public void boardCount(int idx);


}
