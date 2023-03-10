package com.cc.digitalLedger;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class InvalidTransactionAdvance {

    @ResponseBody
    @ExceptionHandler(InvalidTransactionExeption.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    String invalidTransactionHandler(InvalidTransactionExeption ex) {
        return ex.getMessage();
    }
}
