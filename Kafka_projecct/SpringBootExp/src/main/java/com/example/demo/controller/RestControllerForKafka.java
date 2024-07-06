package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.kafka.services.Producer;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafka {
	
	@Autowired
	Producer producer;

	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam("message") String message) {
		producer.sentMassageToTpoic(message);
	}
}
