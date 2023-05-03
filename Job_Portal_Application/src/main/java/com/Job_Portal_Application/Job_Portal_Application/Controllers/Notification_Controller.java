package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Notification;
import com.Job_Portal_Application.Job_Portal_Application.Services.Notification_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "notification")
public class Notification_Controller {
    //    http://localhost:8080/notification/getAll
    @Autowired
    Notification_Service notification_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Notification> getAllNotifications() {

        return notification_service.getAllNotifications();
    }
    @GetMapping(value = "getById")
    public Notification getNotificationById(@RequestParam Integer id) {

        return notification_service.getNotificationById(id);
    }
}
