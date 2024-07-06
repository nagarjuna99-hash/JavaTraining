package com.example.demo.kafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	public void sentMassageToTpoic(String message) {
		kafkaTemplate.send("code_decode", message);

	}

}
