//package com.James.blog.service;
//
//import com.James.blog.mapper.UserMapper;
//import com.James.blog.pojo.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
///**
// * @author jameszhang
// * @Date 2022/4/26
// */
//
//@Service
//public class MyUserDetailServiceImpl implements UserDetailsService {
//
//    @Autowired
//    UserMapper userMapper;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        if (username == null || "".equals(username)) {
//            throw new RuntimeException("用户名不能为空");
//        }
//
//        User user = userMapper.getUserByName(username);
//        if (user == null) {
//            throw new RuntimeException("用户不存在");
//        }
//        return user;
//
//    }
//}
