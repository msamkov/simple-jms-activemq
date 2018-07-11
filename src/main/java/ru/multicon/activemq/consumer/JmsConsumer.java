package ru.multicon.activemq.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


/**
 *  Объект для получения сообщений
 */
@Component
public class JmsConsumer {

	private JmsTemplate jmsTemplate;

    @Autowired
    public JmsConsumer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Value("${jms.queue-demo}")
	String jmsQueue;

	public String receive()
	{
		String message;
		message = (String) jmsTemplate.receiveAndConvert(jmsQueue);
		return message;
	}
}
