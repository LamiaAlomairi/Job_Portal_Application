package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Job_posting;
import com.Job_Portal_Application.Job_Portal_Application.Models.Job_seeker;
import com.Job_Portal_Application.Job_Portal_Application.Services.Job_posting_Service;
import com.Job_Portal_Application.Job_Portal_Application.Services.Job_seeker_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "job_seeker")
public class Job_seeker_Controller {
    //    http://localhost:8080/job_seeker/getAll
    @Autowired
    Job_seeker_Service job_seeker_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Job_seeker> getAllJob_seekers() {

        return job_seeker_service.getAllJob_seekers();
    }
    @GetMapping(value = "getById")
    public Job_seeker getJob_seekerById(@RequestParam Integer id) {

        return job_seeker_service.getJob_seekerById(id);
    }
}
