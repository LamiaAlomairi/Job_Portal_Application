package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Employer;
import com.Job_Portal_Application.Job_Portal_Application.Services.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "employer")
public class EmployerController {
    //    http://localhost:8080/employer/getAll
    @Autowired
    EmployerService employerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Employer> getAllEmployers() {

        return employerService.getAllEmployers();
    }
    @GetMapping(value = "getById")
    public Employer getEmployerById(@RequestParam Integer id) {

        return employerService.getEmployerById(id);
    }
}
