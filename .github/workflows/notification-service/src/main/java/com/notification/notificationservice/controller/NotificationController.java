package com.notification.notificationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.notification.notificationservice.service.NotificationService;

@RestController
public class NotificationController {

    @Autowired

    private NotificationService notificationService;

    

    

    @PostMapping("/notifications/send")

    public ResponseEntity<String>sendNotification(
        @RequestParam String senderName,

        @RequestParam Long senderAcc
    ){

        notificationService.sendNotification(senderName, senderAcc);
        return ResponseEntity.ok("Notification sent successfully");
    }
}
