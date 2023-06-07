package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.JobSeeker;
import com.Job_Portal_Application.Job_Portal_Application.Services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "job_seeker")
public class JobSeekerController {
    //    http://localhost:8080/job_seeker/getAll
    @Autowired
    JobSeekerService jobSeekerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<JobSeeker> getAllJob_seekers() {

        return jobSeekerService.getAllJob_seekers();
    }
    @GetMapping(value = "getById")
    public JobSeeker getJob_seekerById(@RequestParam Integer id) {

        return jobSeekerService.getJob_seekerById(id);
    }
}
