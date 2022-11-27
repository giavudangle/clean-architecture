package com.clean.architecture.domain.entity;

import com.clean.architecture.domain.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Account extends BaseEntity {
  private Long id;
  private String name;
  private String email;
  private String password;
}
