package com.mq.serialize;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialize implements ISerializtion {
	
	private ObjectMapper mapper;
	
	public Serialize() {
		this.mapper = new ObjectMapper();
	}

	@Override
	public String serializeString(Object obj) throws IOException {
		return mapper.writeValueAsString(obj);
	}

	@Override
	public byte[] serializeBytes(Object data) throws Exception {
		return mapper.writeValueAsBytes(data);
	}

}
