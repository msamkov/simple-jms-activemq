package ru.multicon.activemq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.multicon.activemq.producer.JmsProducer;

/**
 * Контроллер для отправки сообщений.
 */
@RestController
public class ProducerController {

	private JmsProducer jmsProducer;

	@Autowired
	public ProducerController(JmsProducer jmsProducer) {
		this.jmsProducer = jmsProducer;
	}

	@RequestMapping(value="/producer")
	public String producer(@RequestParam("message")String message){
		jmsProducer.send(message);
		return "Сообщение отправлено";
	}
	

}
