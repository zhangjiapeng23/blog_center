package com.James.blog.utils;

import com.fasterxml.jackson.core.util.BufferRecycler;
import jdk.nashorn.internal.objects.annotations.Where;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jameszhang
 * @Date 2022/5/4
 */

public class HttpContextUtils {

    public static Map<String, String> getParameterMapAll(HttpServletRequest request) {
        Enumeration<String> parameters = request.getParameterNames();
        Map<String, String> params = new HashMap<>();
        while (parameters.hasMoreElements()) {
            String parameter = parameters.nextElement();
            String value = request.getParameter(parameter);
            params.put(parameter, value);
        }
        return params;
    }

    public static String getBodyString(ServletRequest request){
        StringBuilder sb = new StringBuilder();
        InputStream inputStream = null;
        BufferedReader reader = null;
        try {
            inputStream = request.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            String line = "";
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}
