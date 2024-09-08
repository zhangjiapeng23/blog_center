//package com.James.blog.controller;
//
//import com.James.blog.pojo.Role;
//import com.James.blog.service.RoleService;
//import com.James.blog.service.RoleServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
///**
// * @author jameszhang
// * @Date 2022/5/21
// */
//
//@RestController
//@RequestMapping("/api/role")
//public class Roles {
//
//    @Autowired
//    RoleService roleServiceImpl;
//
//    @GetMapping("/list")
//    public List<Role> getRoleList() {
//        return roleServiceImpl.getRoleList();
//    }
//
//    @GetMapping("/name/{name}")
//    public Role getRoleByName(@PathVariable(name="name") String name) {
//        return roleServiceImpl.getRoleByName(name);
//    }
//
//    @GetMapping("/id/{id}")
//    public Role getRoleById(@PathVariable(name="id") int id) {
//        return roleServiceImpl.getRoleById(id);
//    }
//
//    @PostMapping("/add")
//    public int addRole(@RequestBody Role role){
//        return roleServiceImpl.addRole(role);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public int deleteRole(@PathVariable(name="id") int id) {
//        return roleServiceImpl.deleteRole(id);
//    }
//
//    @PostMapping("/update")
//    public int updateRole(@RequestBody Role role) {
//        return roleServiceImpl.updateRole(role);
//    }
//
//
//}
