package com.notification.notificationservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notification.notificationservice.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
