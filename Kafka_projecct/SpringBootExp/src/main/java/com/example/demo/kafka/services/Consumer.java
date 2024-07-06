package com.example.demo.kafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "code_decode", groupId = "codeDecode_group")
	public void listenToTopic(String message) {
		System.out.println("consumed message from topic" + message);
	}

}
