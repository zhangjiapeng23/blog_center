//package com.James.blog.utils;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwt;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author jameszhang
// * @Date 2022/5/4
// */
//
//public class JwtTokenUtil {
//
//    public static final String TOKEN_HEADER = "Authorization";
//
//    public static final String TOKEN_PREFIX = "Bearer";
//
//    public static final String SUBJECT = "blog";
//
//    public static final long EXPIRATION = 1000 * 60 * 60 * 2;
//
//    public static final String APP_SECRET_KEY = "com.james";
//
//    private static final String ROLE_CLAIMS = "role";
//
//    public static String createToken(String username, String role) {
//        Map<String, Object> map = new HashMap<>();
//        map.put(ROLE_CLAIMS, role);
//
//        String token = Jwts.builder()
//                .setSubject(SUBJECT)
//                .setClaims(map)
//                .claim("username", username)
//                .claim(ROLE_CLAIMS, role)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
//                .signWith(SignatureAlgorithm.HS256, APP_SECRET_KEY).compact();
//        return token;
//    }
//
//    public static Claims checkJWT(String token) {
//        try {
//            final Claims claims = Jwts.parser().setSigningKey(APP_SECRET_KEY)
//                    .parseClaimsJws(token).getBody();
//            return claims;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public static String getUsername(String token) {
//        Claims claims = checkJWT(token);
//        if (claims != null) {
//            return claims.get("username").toString();
//        }
//        return null;
//    }
//
//    public static String getUserRole(String token) {
//        Claims claims = checkJWT(token);
//        if (claims != null) {
//            return claims.get("role").toString();
//        }
//        return null;
//    }
//
//    public static boolean isExpiration(String token) {
//        Claims claims = checkJWT(token);
//        if (claims != null) {
//            return claims.getExpiration().before(new Date());
//        }
//        return false;
//    }
//
//
//
//
//
//
//
//
//}
