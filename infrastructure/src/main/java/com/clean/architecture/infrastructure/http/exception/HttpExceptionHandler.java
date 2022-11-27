package com.clean.architecture.infrastructure.http.exception;

import com.clean.architecture.domain.exception.EntityNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
    HttpExceptionResponse response =
        new HttpExceptionResponse(
            HTTP_RESPONSE_BAD_REQUEST_STATUS.value(),
            exception.getClass().getCanonicalName(),
            exception.getMessage());

    return new ResponseEntity<>(response, headers, HTTP_RESPONSE_BAD_REQUEST_STATUS);
  }

  @ExceptionHandler({EntityNotFoundException.class})
  public final ResponseEntity<Object> handleEntityNotFoundException(
      EntityNotFoundException exception, HttpHeaders headers, WebRequest request) {
    HttpExceptionResponse response =
        new HttpExceptionResponse(
            HTTP_RESPONSE_NOT_FOUND_STATUS.value(),
            exception.getClass().getCanonicalName(),
            exception.getMessage());
    return new ResponseEntity<>(response, headers, HTTP_RESPONSE_NOT_FOUND_STATUS);
  }
}
