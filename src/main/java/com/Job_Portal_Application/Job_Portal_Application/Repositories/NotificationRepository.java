package com.Job_Portal_Application.Job_Portal_Application.Repositories;

import com.Job_Portal_Application.Job_Portal_Application.Models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
