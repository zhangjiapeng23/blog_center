//package com.James.blog.pojo;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Date;
//
///**
// * @author jameszhang
// * @Date 2022/4/24
// */
//
//
//public class User implements UserDetails {
//
//    private int id;
//    private String username;
//    private String email;
//    private String phone;
//    private String password;
//    private Date create_time;
//    private Date update_time;
//
//    public User() {
//    }
//
//    public User(int id, String username, String email, String phone, String password, Date create_time, Date update_time) {
//        this.id = id;
//        this.username = username;
//        this.email = email;
//        this.phone = phone;
//        this.password = password;
//        this.create_time = create_time;
//        this.update_time = update_time;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setCreate_time(Date create_time) {
//        this.create_time = create_time;
//    }
//
//    public void setUpdate_time(Date update_time) {
//        this.update_time = update_time;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        Collection<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority("guest"));
//        return authorities;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public Date getCreate_time() {
//        return create_time;
//    }
//
//    public Date getUpdate_time() {
//        return update_time;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", email='" + email + '\'' +
//                ", phone='" + phone + '\'' +
//                ", password='" + password + '\'' +
//                ", create_time=" + create_time +
//                ", update_time=" + update_time +
//                '}';
//    }
//}
