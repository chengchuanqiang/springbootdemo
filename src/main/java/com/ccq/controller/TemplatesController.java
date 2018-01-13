package com.ccq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author ccq
 * @Description
 * @date 2018/1/13 16:52
 */
@Controller
@RequestMapping("/templates")
public class TemplatesController {

    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        map.put("name","Tom");
        return "hello";
    }
}
