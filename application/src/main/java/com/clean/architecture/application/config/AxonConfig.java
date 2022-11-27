package com.clean.architecture.application.config;

import com.clean.architecture.application.commandbus.CommandBusGateway;
import com.clean.architecture.application.commandbus.GlobalRollbackConfiguration;
import org.axonframework.commandhandling.SimpleCommandBus;
import org.axonframework.messaging.interceptors.BeanValidationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

  @Bean
  public CommandBusGateway commandBusGateway(SimpleCommandBus commandBus) {
    commandBus.setRollbackConfiguration(new GlobalRollbackConfiguration());
    commandBus.registerDispatchInterceptor(new BeanValidationInterceptor<>());
    commandBus.registerHandlerInterceptor(new BeanValidationInterceptor<>());

    return new CommandBusGateway(commandBus);
  }
}
