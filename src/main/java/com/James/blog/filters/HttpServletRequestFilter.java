//package com.James.blog.filters;
//
//import com.James.blog.utils.HttpContextUtils;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletRequestWrapper;
//import javax.xml.ws.RequestWrapper;
//import java.io.BufferedReader;
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//
//
///**
// * @author jameszhang
// * @Date 2022/5/4
// */
//
//@Component
//@WebFilter(filterName = "HttpServletRequestFilter", urlPatterns = "/")
//@Order(10000)
//public class HttpServletRequestFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        ServletRequest requestWrapper = null;
//        if (servletRequest instanceof HttpServletRequest) {
//            requestWrapper = new RequestWrapper ((HttpServletRequest) servletRequest);
//        }
//
//        if (requestWrapper == null) {
//            filterChain.doFilter(servletRequest, servletResponse);
//        } else {
//            filterChain.doFilter(requestWrapper, servletResponse);
//        }
//    }
//
//    @Override
//    public void destroy() {}
//
//    public class RequestWrapper extends HttpServletRequestWrapper {
//
//        private String mbody;
//
//        public RequestWrapper(HttpServletRequest request) {
//            super(request);
//            mbody = getBody(request);
//        }
//
//
//        private String getBody(HttpServletRequest request) {
//            return HttpContextUtils.getBodyString(request);
//        }
//
//        private String getBody() {
//            return mbody;
//        }
//
//        @Override
//        public BufferedReader getReader() throws IOException{
//            return new BufferedReader(new InputStreamReader(getInputStream()));
//        }
//
//        @Override
//        public ServletInputStream getInputStream() throws IOException {
//            final ByteArrayInputStream bais = new ByteArrayInputStream(mbody.getBytes(StandardCharsets.UTF_8));
//            return new ServletInputStream() {
//                @Override
//                public boolean isFinished() {
//                    return false;
//                }
//
//                @Override
//                public boolean isReady() {
//                    return false;
//                }
//
//                @Override
//                public void setReadListener(ReadListener readListener) {
//
//                }
//
//                @Override
//                public int read() throws IOException {
//                    return bais.read();
//                }
//            };
//        }
//    }
//
//}
