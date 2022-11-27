package com.clean.architecture.domain.exception;

import lombok.NonNull;

public class EntityNotFoundException extends DomainException {
  private static final String CODE = "DOMAIN.ERROR.001";

  public EntityNotFoundException(@NonNull final String code, @NonNull final String message) {
    super(code, message);
  }

  public EntityNotFoundException(@NonNull final String message) {
    super(CODE, message);
  }
}
