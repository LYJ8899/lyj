package com.example.kafka_producer.util;

import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

public class KafkaSerializer implements Serializer<Object> {

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
		// TODO Auto-generated method stub

	}

	@Override
	public byte[] serialize(String topic, Object data) {
		// TODO Auto-generated method stub
		return BeanUtils.bean2Byte(data);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
