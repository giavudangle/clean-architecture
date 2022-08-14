package com.clean.architecture.domain.event;

import com.clean.architecture.domain.BaseDomainEvent;
import com.clean.architecture.domain.entity.Account;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AccountCreatedEvent extends BaseDomainEvent {
    @NonNull Account account;
}
