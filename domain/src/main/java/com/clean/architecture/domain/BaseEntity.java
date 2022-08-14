package com.clean.architecture.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
public abstract class BaseEntity {

    @Setter
    Instant gmtCreated;

    @Setter Instant gmtUpdated;

    @Getter Integer version;


}
