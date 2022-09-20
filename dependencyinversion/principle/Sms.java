package com.yolkar62.solidprinciples.dependencyinversion.principle;

public class Sms implements Message{
    public void sendSms(){
        System.out.println("Sms sent.");
    }

    @Override
    public void sendMessage() {
        sendSms();
    }
}
