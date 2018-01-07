package com.ccq;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ccq
 * @Description
 * @date 2018/1/3 23:58
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String say(){
        return "AAA";
    }

}
