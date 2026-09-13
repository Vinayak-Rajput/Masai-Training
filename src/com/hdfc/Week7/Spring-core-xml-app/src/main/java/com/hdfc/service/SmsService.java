package com.hdfc.service;

public class SmsService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("SMS is sent!");
    }
}
