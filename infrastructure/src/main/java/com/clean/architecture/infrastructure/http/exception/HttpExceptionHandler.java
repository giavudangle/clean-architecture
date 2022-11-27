package com.clean.architecture.infrastructure.http.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class HttpExceptionHandler extends ResponseEntityExceptionHandler {
  private static final HttpStatus HTTP_RESPONSE_OK_STATUS = HttpStatus.OK;
  private static final HttpStatus HTTP_RESPONSE_BAD_REQUEST_STATUS = HttpStatus.BAD_REQUEST;
  private static final HttpStatus HTTP_RESPONSE_NOT_FOUND_STATUS = HttpStatus.NOT_FOUND;

  protected ResponseEntity<Object> methodArgumentsNotValidHandler(
      MethodArgumentNotValidException exception,
      HttpHeaders headers,
      HttpStatus status,
      WebRequest request) {
    return null;
  }
}
