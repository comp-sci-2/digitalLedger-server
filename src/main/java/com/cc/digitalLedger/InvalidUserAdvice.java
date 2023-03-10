package com.cc.digitalLedger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class InvalidUserAdvice {

    @ResponseBody
    @ExceptionHandler(InvalidUserExeption.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    String invalidUserAdviceHandler(InvalidUserExeption ex) {
        return ex.getMessage();
    }
}
