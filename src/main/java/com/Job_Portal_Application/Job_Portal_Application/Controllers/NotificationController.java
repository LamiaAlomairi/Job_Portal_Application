package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Notification;
import com.Job_Portal_Application.Job_Portal_Application.Services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "notification")
public class NotificationController {
    //    http://localhost:8080/notification/getAll
    @Autowired
    NotificationService notificationService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Notification> getAllNotifications() {

        return notificationService.getAllNotifications();
    }
    @GetMapping(value = "getById")
    public Notification getNotificationById(@RequestParam Integer id) {

        return notificationService.getNotificationById(id);
    }
}
