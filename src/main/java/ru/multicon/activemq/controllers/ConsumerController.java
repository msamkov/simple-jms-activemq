package ru.multicon.activemq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.multicon.activemq.consumer.JmsConsumer;

/**
 * Контроллер для получения сообщений
 */
@RestController
public class ConsumerController {

	private JmsConsumer jmsConsumer;

	@Autowired
    public ConsumerController(JmsConsumer jmsConsumer) {
        this.jmsConsumer = jmsConsumer;
    }

    @RequestMapping(value="/consumer")
	public String consumer(){
		return jmsConsumer.receive();
	}
}
