package com.api.order.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@Data
@Builder
public class ErrorDto {
    private String path;
    private String message;
    private HttpStatus httpStatus;
    private LocalDateTime errorTime;
}
