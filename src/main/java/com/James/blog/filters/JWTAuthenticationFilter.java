//package com.James.blog.filters;
//
//import com.James.blog.pojo.User;
//import com.James.blog.utils.HttpContextUtils;
//import com.James.blog.utils.JwtTokenUtil;
//import com.alibaba.druid.support.json.JSONUtils;
//import com.alibaba.fastjson.JSON;
//import org.springframework.security.authentication.*;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author jameszhang
// * @Date 2022/5/4
// */
//
//public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
//
//    private AuthenticationManager authenticationManager;
//
//    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/api/user/login"));
//        super.doFilter(request, response, chain);
//    }
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
//            throws AuthenticationException {
//        String body = HttpContextUtils.getBodyString(request);
//        Map map = JSON.parseObject(body);
//        String username = (String) map.get("username");
//        String password = (String) map.get("password");
//        return authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(username, password));
//    }
//
//    @Override
//    public void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
//                                         FilterChain chain, Authentication authResult) throws IOException {
//        User user = (User) authResult.getPrincipal();
//
//        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
//        String token = JwtTokenUtil.createToken(user.getUsername(), authorities.toString());
//
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("application/json; charset=utf-8");
//
//        response.setHeader("token", JwtTokenUtil.TOKEN_PREFIX + token);
//
//        response.setContentType("text/json; charset=utf-8");
//        Map<String, String> respMap = new HashMap<>();
//        respMap.put("msg", "登录成功");
//        respMap.put("accessToken", JwtTokenUtil.TOKEN_PREFIX + token);
//        response.getWriter().write(JSONUtils.toJSONString(respMap));
//
//    }
//
//    public void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
//                                           AuthenticationException failed) throws IOException, ServletException {
//        String returnData = "";
//        if (failed instanceof AccountExpiredException) {
//            returnData = "账号过期";
//        } else if (failed instanceof BadCredentialsException) {
//            returnData = "密码错误";
//        } else if (failed instanceof CredentialsExpiredException) {
//            returnData = "密码过期";
//        } else if (failed instanceof DisabledException) {
//            returnData = "账号不可用";
//        } else if (failed instanceof LockedException) {
//            returnData = "账号锁定";
//        } else if (failed instanceof InternalAuthenticationServiceException) {
//            returnData = "用户不存在";
//        } else {
//            returnData = "未知异常";
//        }
//        response.setContentType("text/json; charset=utf-8");
//        Map<String, String> respMap = new HashMap<>();
//        respMap.put("msg", returnData);
//        response.getWriter().write(JSONUtils.toJSONString(respMap));
//    }
//
//
//
//
//}
