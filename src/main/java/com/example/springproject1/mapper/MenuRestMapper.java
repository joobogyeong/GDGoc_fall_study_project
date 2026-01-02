package com.example.springproject1.mapper;

import com.example.springproject1.entity.Menu;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface MenuRestMapper {
    @Select()
    public List<Menu> getLists();
    @Insert()
    public void boardInsert(Menu menu);
    @Select()
    public Menu boardContent(int idx);
    @Delete("delete from backend_spring_project.menu where idx=#{idx}")
    public void boardDelete(int idx);
    @Update("update backend_spring_project.menu set title=#{title},content=#{content},writer=#{writer} where idx=#{idx}")
    public void boardUpdate(Menu menu);
    @Update("update backend_spring_project.menu set count = count+1 where idx=#{idx}")
    public void boardCount(int idx);


}
