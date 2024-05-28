package com.api.order.exception;

import com.api.order.dto.ErrorDto;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class OrderGlobalException {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorDto> handleRuntimeException(RuntimeException runtimeException, WebRequest webRequest) {

       return ResponseEntity.ok(ErrorDto.builder().
                errorTime(LocalDateTime.now())
                .path(webRequest.getDescription(false))
                .message(runtimeException.getMessage())
                .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR).build());

    }
}
