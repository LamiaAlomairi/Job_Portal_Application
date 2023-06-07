package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Application;
import com.Job_Portal_Application.Job_Portal_Application.Services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "application")
public class ApplicationController {
    //    http://localhost:8080/application/getAll
    @Autowired
    ApplicationService applicationService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Application> getAllApplications() {

        return applicationService.getAllApplications();
    }
    @GetMapping(value = "getById")
    public Application getApplicationById(@RequestParam Integer id) {

        return applicationService.getApplicationById(id);
    }
}
