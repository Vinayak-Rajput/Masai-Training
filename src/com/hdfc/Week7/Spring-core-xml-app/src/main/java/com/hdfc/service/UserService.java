package com.hdfc.service;

public class UserService {

    private NotificationService notificationService;

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser() {

        System.out.println("User Registered Successfully!");

        notificationService.sendNotification();
    }
}
