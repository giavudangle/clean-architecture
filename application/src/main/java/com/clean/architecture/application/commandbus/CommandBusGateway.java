package com.clean.architecture.application.commandbus;

import org.axonframework.commandhandling.CommandBus;
import org.axonframework.commandhandling.gateway.DefaultCommandGateway;

public class CommandBusGateway extends DefaultCommandGateway {
  public CommandBusGateway(CommandBus commandBus) {
    super(DefaultCommandGateway.builder().commandBus(commandBus));
  }
}
