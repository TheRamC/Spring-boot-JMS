package com.example.activemq.ActiveMqDemo.consumer;

import com.example.activemq.ActiveMqDemo.model.MessageBody;
import com.example.activemq.ActiveMqDemo.util.ActiveMqDemoConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeMessage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageBody.class);

    @JmsListener(destination = ActiveMqDemoConstants.DESTINATION_NAME)
    public void messageConsume(MessageBody messageBody){
        LOGGER.info("Message received {}",messageBody);
    }
}
