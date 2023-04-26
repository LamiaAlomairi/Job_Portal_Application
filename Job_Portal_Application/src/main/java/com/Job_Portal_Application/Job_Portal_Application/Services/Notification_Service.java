package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Interview;
import com.Job_Portal_Application.Job_Portal_Application.Models.Notification;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Interview_Repository;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Notification_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Notification_Service {
    @Autowired
    Notification_Repository notification_repository;
    public List<Notification> getAllNotifications() {

        return notification_repository.findAll();
    }

    public Notification getNotificationById(Integer id) {

        return notification_repository.findById(id).get();
    }
}
