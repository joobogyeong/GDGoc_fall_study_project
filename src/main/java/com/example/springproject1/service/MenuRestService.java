package com.example.springproject1.service;

import com.example.springproject1.entity.Menu;
import com.example.springproject1.mapper.MenuRestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuRestService {
    @Autowired
    private MenuRestMapper menuRestMapper;

    //계시글 목록을 가져오는 메소드
    public List<Menu> getLists(){
        return menuRestMapper.getLists();
    }
    //계시글을 추가하는 메소드
    public void boardInsert(Menu menu){
        menuRestMapper.boardInsert(menu);
    }
    //특정 계시글의 내용을 가져오는 메소드
    public Menu boardContent(int idx){
        return menuRestMapper.boardContent(idx);
    }
    public void boardDelete(int idx){
        menuRestMapper.boardDelete(idx);
    }
    //셰시글을 수정하는 메소드
    public void boardUpdate(Menu menu){
        menuRestMapper.boardUpdate(menu);
    }
    //계시글의 조회수를 증가시키는 메소드
    public void boardCount(int idx){
        menuRestMapper.boardCount(idx);
    }


}
