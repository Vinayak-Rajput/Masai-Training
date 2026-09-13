package com.hdfc.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SmsService implements NotificationService{

    @Override
    public void sendNotification() {

        System.out.println("SMS is sent!");
    }

    @Override
    public String toString() {
        return "SmsService{}";
    }
}
