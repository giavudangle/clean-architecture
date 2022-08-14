package com.clean.architecture.domain;

import java.util.List;

public interface EventDispatcher {
    void dispatch(List<? extends BaseEvent> events);
    <T extends BaseEvent> void dispatch(T event);
}
