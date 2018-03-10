package com.iotek.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by thinkpad on 2018/3/9.
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler
    public  String  error500(NullPointerException e){
        return "redirect:/staticPage/500.html";
    }
}
