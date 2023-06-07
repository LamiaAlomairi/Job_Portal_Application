package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.JobPosting;
import com.Job_Portal_Application.Job_Portal_Application.Services.JobpostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "job_posting")
public class JobPostingController {
    //    http://localhost:8080/job_posting/getAll
    @Autowired
    JobpostingService jobpostingService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<JobPosting> getAllJob_postings() {

        return jobpostingService.getAllJob_postings();
    }
    @GetMapping(value = "getById")
    public JobPosting getJob_postingById(@RequestParam Integer id) {

        return jobpostingService.getJob_postingById(id);
    }
}
