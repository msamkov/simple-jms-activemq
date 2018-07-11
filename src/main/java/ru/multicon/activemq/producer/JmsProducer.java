package ru.multicon.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 *  Объект для отправки сообщений
 */
@Component
public class JmsProducer {

	private JmsTemplate jmsTemplate;

	@Autowired
    public JmsProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Value("${jms.queue-demo}")
	String jmsQueue;
	
	public void send(String message){
		jmsTemplate.convertAndSend(jmsQueue, message);
	}
}