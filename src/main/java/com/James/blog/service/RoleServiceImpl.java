//package com.James.blog.service;
//
//import com.James.blog.mapper.RoleMapper;
//import com.James.blog.pojo.Role;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//import java.util.List;
//
///**
// * @author jameszhang
// * @Date 2022/5/21
// */
//
//@Service
//public class RoleServiceImpl implements RoleService{
//
//    @Autowired
//    RoleMapper roleMapper;
//
//    @Override
//    public List<Role> getRoleList() {
//        return roleMapper.getRoleList();
//    }
//
//    @Override
//    public Role getRoleByName(String name) {
//        return roleMapper.getRoleByName(name);
//    }
//
//    @Override
//    public int addRole(Role role) {
//        Date currentTime = new Date();
//        role.setCreateTime(currentTime);
//        role.setUpdateTime(currentTime);
//        return roleMapper.insertRole(role);
//    }
//
//    @Override
//    public int updateRole(Role role) {
//        Date currentTime = new Date();
//        role.setCreateTime(currentTime);
//        role.setUpdateTime(currentTime);
//        return roleMapper.updateRole(role);
//    }
//
//    @Override
//    public int deleteRole(int id) {
//        return roleMapper.deleteRoleById(id);
//    }
//
//    @Override
//    public Role getRoleById(int id) {
//        return roleMapper.getRoleById(id);
//    }
//}
