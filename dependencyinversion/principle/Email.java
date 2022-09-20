package com.yolkar62.solidprinciples.dependencyinversion.principle;

public class Email implements Message {
    public void sendEmail(){

        System.out.println("E-mail sent.");
    }

    @Override
    public void sendMessage() {
        sendEmail();
    }
}
