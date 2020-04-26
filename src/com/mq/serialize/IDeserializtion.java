package com.mq.serialize;

import com.fasterxml.jackson.core.type.TypeReference;

public interface IDeserializtion {
	public <T> T deserializeString(String data, TypeReference<T> typeReference) throws Exception;
	
	public <T> T deserializeBytes(byte[] data, TypeReference<T> typeReference) throws Exception;
}
