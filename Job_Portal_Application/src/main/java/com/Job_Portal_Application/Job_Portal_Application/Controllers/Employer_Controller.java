package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Application;
import com.Job_Portal_Application.Job_Portal_Application.Models.Employer;
import com.Job_Portal_Application.Job_Portal_Application.Services.Application_Service;
import com.Job_Portal_Application.Job_Portal_Application.Services.Employer_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "employer")
public class Employer_Controller {
    //    http://localhost:8080/employer/getAll
    @Autowired
    Employer_Service employer_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Employer> getAllEmployers() {

        return employer_service.getAllEmployers();
    }
    @GetMapping(value = "getById")
    public Employer getEmployerById(@RequestParam Integer id) {

        return employer_service.getEmployerById(id);
    }
}
