package com.notification.notificationservice.service;

import java.time.LocalDateTime;



import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.notification.notificationservice.Repository.NotificationRepository;
import com.notification.notificationservice.model.Notification;



@Service
public class NotificationService {


    @Autowired
   
    private NotificationRepository notificationRepository;


    ///private JavaMailSender javaMailSender;

    

public void sendNotification(String senderEmail, Long senderAccNo) {
        Notification notification = new Notification();
        notification.setSenderEmail(senderEmail);
        notification.setSenderAccNo(senderAccNo);
       
   

 

        notificationRepository.save(notification);

 

        //sendEmailNotification(notification);
    }



/*private void sendEmailNotification(Notification notification) {

    MimeMessage message = javaMailSender.createMimeMessage();
    MimeMessageHelper helper = new MimeMessageHelper(message, "utf-8");


    String accountNumber = 
    String.valueOf(notification.getSenderAccNo());


          

 

            javaMailSender.send(message);
            notification.setSentTimestamp(LocalDateTime.now());
            notificationRepository.save(notification);
         
   
}
*/

 

    /*public void sendEmailNotification(Notification notification) {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, "utf-8");

 

        
            helper.setTo(notification.getSenderName());
            helper.setSubject(notification.getSenderAccNo());
           

 

            javaMailSender.send(mimeMessage);
            notification.setSentTimestamp(LocalDateTime.now());
            notificationRepository.save(notification);
         
            

        
    }
    */
    
}
