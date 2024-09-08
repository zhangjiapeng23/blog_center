//package com.James.blog.filters;
//
//
//import com.alibaba.fastjson.JSONObject;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.AuthenticationEntryPoint;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @author jameszhang
// * @Date 2022/5/4
// */
//
//public class JWTAuthenticationEntryPoint implements AuthenticationEntryPoint {
//
//    @Override
//    public void commence(HttpServletRequest request, HttpServletResponse response,
//                         AuthenticationException authException) throws IOException, ServletException {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/javascript; charset=utf-8");
//        response.getWriter().print(JSONObject.toJSONString("您未登录，没有权限访问"));
//    }
//}
