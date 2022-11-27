package com.clean.architecture.domain.adapter;

import com.clean.architecture.domain.exception.SerializingException;

public interface SerializerInterface {
  <T> byte[] serialize(T message) throws SerializingException;

  <T> T deserialize(byte[] payload, Class<T> clazz) throws SerializingException;
}
