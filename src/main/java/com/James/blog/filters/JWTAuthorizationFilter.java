//package com.James.blog.filters;
//
////import com.James.blog.config.SecurityConfig;
//import com.James.blog.utils.JwtTokenUtil;
//import com.sun.tools.javac.code.Attribute;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collection;
//
///**
// * @author jameszhang
// * @Date 2022/5/4
// */
//
//public class JWTAuthorizationFilter extends BasicAuthenticationFilter {
//
//    public JWTAuthorizationFilter(AuthenticationManager authenticationManager) {
//        super(authenticationManager);
//    }
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
//        String tokenHeader = request.getHeader(JwtTokenUtil.TOKEN_HEADER);
//
//        if (tokenHeader == null || !tokenHeader.startsWith(JwtTokenUtil.TOKEN_PREFIX)) {
//            chain.doFilter(request, response);
//            return;
//        }
//
//        SecurityContextHolder.getContext().setAuthentication(getAuthentication(tokenHeader));
//        super.doFilterInternal(request, response, chain);
//    }
//
//    private UsernamePasswordAuthenticationToken getAuthentication(String tokenHeader) {
//        String token = tokenHeader.replace(JwtTokenUtil.TOKEN_PREFIX, "");
//        String username = JwtTokenUtil.getUsername(token);
//        String role = JwtTokenUtil.getUserRole(token);
//
//        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        if (role != null) {
//            String[] roles = StringUtils.strip(role, "[]").split(",");
//            for (String s: roles) {
//                authorities.add(new SimpleGrantedAuthority(s));
//            }
//        }
//
//        if (username != null) {
//            return new UsernamePasswordAuthenticationToken(username, null, authorities);
//        }
//        return null;
//    }
//
//}
