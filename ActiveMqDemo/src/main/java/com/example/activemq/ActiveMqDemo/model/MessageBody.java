package com.example.activemq.ActiveMqDemo.model;

import java.io.Serializable;

public class MessageBody implements Serializable {

    private static final long serialVersionUID = 1L;

    private int messageId;
    private String messageBody;

    public int getMessageId() {
        return messageId;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public String toString() {
        return "MessageBody{" +
                "messageId=" + messageId +
                ", messageBody='" + messageBody + '\'' +
                '}';
    }
}
