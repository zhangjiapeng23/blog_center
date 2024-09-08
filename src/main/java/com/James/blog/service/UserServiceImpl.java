//package com.James.blog.service;
//
//import com.James.blog.mapper.UserMapper;
//import com.James.blog.pojo.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//import java.util.List;
//
///**
// * @author jameszhang
// * @Date 2022/4/25
// */
//
//@Service
//public class UserServiceImpl implements UserService{
//
//    @Autowired
//    UserMapper userMapper;
//
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//    private final Integer INSERT_SUCCESS = 1;
//
//    public List<User> getUserList() {
//        return userMapper.userList();
//    }
//
//    public String getUsernameById(int id) {
//        User user = userMapper.getUserById(id);
//        return user.getUsername();
//    }
//
//    public int updateUser(User user) {
//        return userMapper.updateUserById(user);
//    }
//
//    public User getUserById(int id) {
//        return userMapper.getUserById(id);
//    }
//
//    public boolean addUser(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        Date currentTime = new Date();
//        user.setCreate_time(currentTime);
//        user.setUpdate_time(currentTime);
//        return userMapper.insertUser(user) == INSERT_SUCCESS;
//    }
//}
