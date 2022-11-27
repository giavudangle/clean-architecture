package com.clean.architecture.infrastructure.http.exception;

public class HttpException {
  private Integer code;
  private String exception;
  private String message;

  public HttpException(Integer code, String exception, String message) {
    this.code = code;
    this.exception = exception;
    this.message = message;
  }

  public Integer getCode() {
    return code;
  }

  public String getException() {
    return exception;
  }

  public String getMessage() {
    return message;
  }
}
