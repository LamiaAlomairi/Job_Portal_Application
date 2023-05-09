package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Application;
import com.Job_Portal_Application.Job_Portal_Application.Services.Application_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "application")
public class Application_Controller {
    //    http://localhost:8080/application/getAll
    @Autowired
    Application_Service application_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Application> getAllApplications() {

        return application_service.getAllApplications();
    }
    @GetMapping(value = "getById")
    public Application getApplicationById(@RequestParam Integer id) {

        return application_service.getApplicationById(id);
    }
}
