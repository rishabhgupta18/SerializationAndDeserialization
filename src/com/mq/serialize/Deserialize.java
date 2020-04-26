package com.mq.serialize;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserialize implements IDeserializtion {

	private ObjectMapper mapper;

	public Deserialize() {
		this.mapper = new ObjectMapper();
	}

	@Override
	public <T> T deserializeString(String data, TypeReference<T> typeReference) throws Exception {
		return mapper.readValue(data, typeReference);
	}

	@Override
	public <T> T deserializeBytes(byte[] data, TypeReference<T> typeReference) throws Exception {
		return mapper.readValue(data, typeReference);
	}

}
