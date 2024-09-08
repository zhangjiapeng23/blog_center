package com.James.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jameszhang
 * @Date 2024/9/8
 */


@RestController
@RequestMapping("/api/temp")
public class Temp {

    @GetMapping("/list")
    public List<String> getRoleList() {
        List<String> res = new ArrayList<String>();
        res.add("zhangjiapeng");
        res.add("Jameszhang");
        return res;
    }

}
