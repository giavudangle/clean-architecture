package com.clean.architecture.infrastructure.http.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

public class HttpValidationError {
  public List<String> getErrors() {
    return errors;
  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> errors = new ArrayList<>();

  private final String message;

  public HttpValidationError(String message) {
    this.message = message;
  }

  public void addValidationError(String error) {
    this.errors.add(error);
  }

  public static HttpValidationError fromErrors(Errors errors) {
    HttpValidationError error =
        new HttpValidationError(
            String.format("Number of validation errors: %d", errors.getErrorCount()));
    for (FieldError fieldError : errors.getFieldErrors()) {
      error.addValidationError(
          String.format("%d %s", fieldError.getField(), fieldError.getDefaultMessage()));
    }
  }
}
