package com.ccq.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ccq
 * @Description 全局捕捉异常
 * @date 2018/1/13 16:03
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String defaultExceptionHandler(HttpServletRequest req, Exception e){

        // ModelAndView
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName(viewName);

        return "对不起，服务器繁忙，请稍后再试";
    }

}
