//package com.James.blog.controller;
//
//import com.James.blog.pojo.User;
//import com.James.blog.service.UserService;
//import com.James.blog.service.UserServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
///**
// * @author jameszhang
// * @Date 2022/4/24
// */
//
//@RestController
//@RequestMapping("/api/user")
//public class Account {
//
//    @Autowired
//    UserService userServiceImpl;
//
//    @GetMapping("/list")
//    public List<User> userList() {
//        return userServiceImpl.getUserList();
//    }
//
//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable(name="id") int id) {
//        return userServiceImpl.getUserById(id);
//    }
//
//    @GetMapping("/name/{id}")
//    public String getUsername(@PathVariable(name="id") int id) {
//        return userServiceImpl.getUsernameById(id);
//    }
//
//    @PostMapping("/update")
//    public int updateUser(@RequestBody com.James.blog.pojo.User user) {
//        return userServiceImpl.updateUser(user);
//    }
//
//    @PostMapping("/register")
//    public boolean registerUser(@RequestBody com.James.blog.pojo.User user) {
//        return userServiceImpl.addUser(user);
//    }
//
//}
