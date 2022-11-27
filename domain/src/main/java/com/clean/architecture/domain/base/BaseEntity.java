package com.clean.architecture.domain.base;

import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class BaseEntity {

  @Setter Instant gmtCreated;

  @Setter Instant gmtUpdated;

  @Getter Integer version;
}
