package com.example.activemq.ActiveMqDemo.controller;

import com.example.activemq.ActiveMqDemo.model.MessageBody;
import com.example.activemq.ActiveMqDemo.util.ActiveMqDemoConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublishMessageController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestBody MessageBody messageBody) {

        try {
            jmsTemplate.convertAndSend(ActiveMqDemoConstants.DESTINATION_NAME, messageBody);
            return new ResponseEntity<>("", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Exception : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
