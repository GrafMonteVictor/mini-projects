package com.example.spring_postgre_app.controller;

import com.example.spring_postgre_app.model.ErrorInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice //spring, перехвати ответ из контроллера
@Slf4j

public class ErrorController {
    @ExceptionHandler(Exception.class) //spring, перехвати ответ-исключение
    @ResponseBody //spring, ответ в виде json
    public ErrorInfo processException(Exception e) {
        log.error(e.getMessage());
        return new ErrorInfo(e.getMessage());
    }

}
