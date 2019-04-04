package com.example.kafka_producer;

import java.text.SimpleDateFormat;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.kafka_producer.entity.Photo;

@SpringBootApplication
public class KafkaProducerApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(KafkaProducerApplication.class, args);
		
		
		
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
			System.out.println("send success");
			i++;
		}
	}

}
