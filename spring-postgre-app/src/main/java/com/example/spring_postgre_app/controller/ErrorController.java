package com.example.spring_postgre_app.controller;

import com.example.spring_postgre_app.model.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
/*
* spring, перехвати исключения из любого контроллера*/
public class ErrorController {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ErrorInfo processException(Exception e) {
        return new ErrorInfo();
    }

}
