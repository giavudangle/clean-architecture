package com.clean.architecture.application.eventlistener;

import lombok.RequiredArgsConstructor;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AccountCreatedListener {

  @EventHandler
  public void handle() {}
}
