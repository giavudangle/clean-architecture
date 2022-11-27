package com.clean.architecture.domain.exception;

import lombok.NonNull;

public class SerializingException extends Throwable {
  public SerializingException(@NonNull final String message, @NonNull final Throwable e) {
    super(message, e);
  }
}
