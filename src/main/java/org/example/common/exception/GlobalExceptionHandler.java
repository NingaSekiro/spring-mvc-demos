package org.example.common.exception;

import lombok.NonNull;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * exception handler for bad request.
     *
     * @param e exception
     * @return ResponseResult
     */
    @ResponseBody
    @ExceptionHandler(value = {BaseRuntimeException.class})
    public String handleParameterVerificationException(@NonNull Exception e) {
        return "invalid";
    }

}
