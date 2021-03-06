package net.lr.demo.chat.service;

import java.io.Serializable;
import java.util.Date;

public class ChatMessage implements Serializable {
    private static final long serialVersionUID = 4385853956172948160L;
    private Date time;
    private String sender;
    private String message;
    private String senderId;
    
    public ChatMessage(String senderId, String sender, String message) {
        this.senderId = senderId;
        this.time = new Date();
        this.sender = sender;
        this.message = message;
    }
    
    public Date getTime() {
        return time;
    }
    
    public String getSenderId() {
        return senderId;
    }
    
    public String getSender() {
        return sender;
    }
    
    public String getMessage() {
        return message;
    }
}
