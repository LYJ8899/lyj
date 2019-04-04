package com.example.kafka_producer;

import java.text.SimpleDateFormat;
//import util.properties packages
import java.util.Properties;

//import simple producer packages
import org.apache.kafka.clients.producer.Producer;

//import KafkaProducer packages
import org.apache.kafka.clients.producer.KafkaProducer;

//import ProducerRecord packages
import org.apache.kafka.clients.producer.ProducerRecord;

import com.example.kafka_producer.entity.Photo;

//Create java class named “SimpleProducer"
public class SimpleProducer {

	public static void main(String[] args) throws Exception {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String topicName = "demo_topic";

		// create instance for properties to access producer configs
		Properties props = new Properties();

		// Assign localhost id
		props.put("bootstrap.servers", "192.168.11.145:9092");

		// Set acknowledgements for producer requests.
		props.put("acks", "all");

		// If the request fails, the producer can automatically retry,
		props.put("retries", 0);

		// Specify buffer size in config
		props.put("batch.size", 16384);

		// Reduce the no of requests less than 0
		props.put("linger.ms", 1);

		// The buffer.memory controls the total amount of memory available to
		// the producer for buffering.
		props.put("buffer.memory", 33554432);

		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		props.put("value.serializer", "com.example.kafka_producer.util.KafkaSerializer");

		Producer<String, String> producer = new KafkaProducer<String, String>(props);
		Producer<String, Photo> photoProducer = new KafkaProducer<>(props);

		int i = 0;
		while (true) {
			Thread.sleep(1000);
			photoProducer.send(new ProducerRecord<String, Photo>(topicName, Integer.toString(i), new Photo()));
			i++;
		}

	}
}