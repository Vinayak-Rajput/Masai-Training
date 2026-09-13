package com.hdfc.service;

public class EmailService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Email Notification is sent!");
    }
}
