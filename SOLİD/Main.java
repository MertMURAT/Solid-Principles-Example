package com.yolkar62.solidprinciples;

import com.yolkar62.solidprinciples.dependencyinversion.principle.Email;
import com.yolkar62.solidprinciples.dependencyinversion.principle.Message;
import com.yolkar62.solidprinciples.dependencyinversion.principle.Notification;
import com.yolkar62.solidprinciples.dependencyinversion.principle.Sms;

import java.util.ArrayList;
import java.util.List;


public class Main {



    public static void main(String[] args) {



        Message message = new Email();
        Message sms = new Sms();

        List<Message> messageList = new ArrayList<>();
        messageList.add(message);
        messageList.add(sms);

        Notification notification = new Notification(messageList);
        notification.sender();

    }
}