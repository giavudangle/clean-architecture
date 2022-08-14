package com.clean.architecture.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class BaseStatusEvent <X, T extends Enum<T>> extends BaseDomainEvent {
}
