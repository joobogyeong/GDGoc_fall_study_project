package com.example.springproject1.controller;

import com.example.springproject1.entity.Menu;
import com.example.springproject1.service.MenuRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class MenuRestController {
    @Autowired
    private MenuRestService menuRestService;

    //1. 메뉴 조회 기능
    @GetMapping("menu/all")
    public ResponseEntity<List<Menu>> getAllMenus(){
        List<Menu>menus=menuRestService.getLists();
        if(menus!=null && !menus.isEmpty()){
            return ResponseEntity.ok(menus);
        }else{
            return ResponseEntity.noContent().build(); //204번
        }
    }
    //2. 메뉴 생성
    @PostMapping("/menu/add")
    public ResponseEntity<String> addMenu(@RequestBody Menu menu){
        if(menu.getIndate()==null || menu.getIndate().isEmpty()){
            menu.setIndate(LocalDate.now().toString());
        }
        //조회수는 처음에는 0으로 설정
        menu.setCount(0);
        //메뉴를 데이터베이스에 삽입
        menuRestService.boardInsert(menu);
        return ResponseEntity.ok("게시글 잘 작성됨");
    }
    //3. 메뉴 슈정
    @PutMapping("/menu/update/{idx}") //update
    public void updateMenu(@RequestBody Menu menu,  @PathVariable int idx){
        menu.setIdx(idx);
        menuRestService.boardUpdate(menu);
    }
    //4. 메뉴 삭제
    @DeleteMapping("/menu/delete/{idx}")
    public void deleteMenu(@PathVariable("idx") int idx){
        menuRestService.boardDelete(idx);
    }
    //5. 특정 게시판 조회
    @GetMapping("/menu/{idx}")
    public ResponseEntity<Menu> getMenu(@PathVariable("idx") int idx){
        Menu menu = menuRestService.boardContent(idx);
        if(menu!=null){
            return ResponseEntity.ok(menu);
        }else{
            return ResponseEntity.notFound().build();
            //메뉴가 존재하지 않을 경우 404
        }
    }
    //6. 조회수 증가
    @PutMapping("/menu/count/{idx}")
    public void incrementCount(@PathVariable("idx") int idx){
        menuRestService.boardCount(idx);
    }
}
