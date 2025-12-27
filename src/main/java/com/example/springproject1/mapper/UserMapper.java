package com.example.springproject1.mapper;

import com.example.springproject1.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper

public interface UserMapper {
    // CRUD의 CREATE에 해당하는 기능중하나
    @Insert("INSERT INTO backend_spring_project.user(username,password,writer,role) VALUES(#{username},#{password},#{writer},#{role})")

    void insertUser(User user);

    // void => 우리가 데이터베이스에 넣은것을(스프링입장으로) 데이터를
    // 가져오는게 없기 때문에 void로 가져오는게 없다고 작성한다.

    // CRUD의 READ에 해당하는 기능중하나
    @Select("SELECT username,password,writer,role FROM backend_spring_project.userWHERE username =#{username}")

    User findByUsername(String username);

    @Select("SELECT writer FROM backend_spring_project.user WHERE username=#{username}")
    String findWriter(String username);

    // CRUD의 UPDATE에 해당하는 기능중하나
    // @Update()

    // CRUD의 DELETE에 해당하는 기능중하나
    // @Delete()

}
