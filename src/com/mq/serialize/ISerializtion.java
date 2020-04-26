package com.mq.serialize;

public interface ISerializtion {

	default String serializeString(Object obj) throws Exception {
		throw new UnsupportedOperationException();
	}

	default byte[] serializeBytes(Object data) throws Exception {
		throw new UnsupportedOperationException();
	}
}
