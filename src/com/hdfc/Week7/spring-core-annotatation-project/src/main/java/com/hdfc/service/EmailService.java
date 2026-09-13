package com.hdfc.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements NotificationService{

    @Override
    public void sendNotification() {
        System.out.println("Email Notification is sent!");
    }

    @Override
    public String toString() {
        return "EmailService{}";
    }
}
