package com.clean.architecture.application.commandbus;

import org.axonframework.messaging.unitofwork.RollbackConfiguration;

public class GlobalRollbackConfiguration implements RollbackConfiguration {
  @Override
  public boolean rollBackOn(Throwable throwable) {
    // TODO: Implement rollback logic when got exceptions
    return false;
  }
}
