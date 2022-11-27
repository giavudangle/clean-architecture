package com.clean.architecture.domain.adapter;

import com.clean.architecture.domain.base.BaseEvent;
import java.util.List;

public interface EventDispatcher {
  void dispatch(List<? extends BaseEvent> events);

  <T extends BaseEvent> void dispatch(T event);
}
