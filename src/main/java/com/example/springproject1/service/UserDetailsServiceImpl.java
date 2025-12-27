package com.example.springproject1.service;


import com.example.springproject1.entity.CustomUser;
import com.example.springproject1.entity.User;
import com.example.springproject1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{

        User user = userMapper.findByUsername(username);
        if(user == null){
            //데이터가 없을 경우
            throw new UsernameNotFoundException(username+"존재하지 않습니다");
        }
        //존재할 경우
        return new CustomUser(user);
    }

}
