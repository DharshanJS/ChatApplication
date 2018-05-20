package com.example.dharshan.chatapplication;

import java.util.Date;

/**
 * Created by Dharshan on 5/15/2018.
 */

public class ChatMessage {
    private String messageText;
    private String messageUser;
    private long messageTimeDate;

    public ChatMessage(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;

        messageTimeDate = new Date().getTime();
    }

    public ChatMessage() {
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTimeDate() {
        return messageTimeDate;
    }

    public void setMessageTimeDate(long messageTimeDate) {
        this.messageTimeDate = messageTimeDate;
    }
}
