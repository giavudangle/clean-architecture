package com.clean.architecture.domain.exception;

import lombok.NonNull;

public class DomainException extends Exception {
  public static final String UNKNOWN_ERROR_CODE = "UNKNOWN_ERROR_CODE";

  public String getCode() {
    return code;
  }

  private @NonNull final String code;

  public DomainException(@NonNull final String code, @NonNull final String message) {
    super(message);
    this.code = code;
  }
}
