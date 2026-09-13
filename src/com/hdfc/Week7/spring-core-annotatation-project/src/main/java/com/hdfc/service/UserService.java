package com.hdfc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.beans.BeanProperty;

@Service
public class UserService {


    private NotificationService notificationService;

    public UserService() {
    }

    @Autowired(required = false)
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser() {

        System.out.println("User Registered Successfully!");

        notificationService.sendNotification();
    }
}
