package com.example.chitchat;
import java.util.Date;
public class ChatMessage {

    private String messageUser;
    private String messageText;
    private Long messageTime;

    public ChatMessage(String messageUser, String messageText){
        this.messageUser = messageUser;
        this.messageText = messageText;

        messageTime = new Date().getTime();
    }
    public ChatMessage(){

    }
    public String getMessageText(){
        return messageText;
    }

    public void setMessageText(String messageText){
        this.messageText = messageText;
    }
    public String getMessageUser(){
        return messageUser;
    }
    public void setMessageUser(String messageUser){
        this.messageUser = messageUser;
    }
    public long getMessageTime(){
        return messageTime;
    }

    public void setMessageTime(Long messageTime) {
        this.messageTime = messageTime;
    }
}