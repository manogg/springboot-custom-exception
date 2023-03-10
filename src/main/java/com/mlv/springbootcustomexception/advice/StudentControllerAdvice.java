package com.mlv.springbootcustomexception.advice;

import com.mlv.springbootcustomexception.exception.HandleEmpty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class StudentControllerAdvice {

    @ExceptionHandler(HandleEmpty.class)
    public ResponseEntity<String> handleEmpty(HandleEmpty handleEmpty){

        return new ResponseEntity(handleEmpty.getErrorMessage(),HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException handleNoSuchElementException){

        return new ResponseEntity("No elements found or parameter missing:",HttpStatus.NOT_FOUND);
    }

}
