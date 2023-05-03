package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Job_posting;
import com.Job_Portal_Application.Job_Portal_Application.Services.Job_posting_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "job_posting")
public class Job_posting_Controller {
    //    http://localhost:8080/job_posting/getAll
    @Autowired
    Job_posting_Service job_posting_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Job_posting> getAllJob_postings() {

        return job_posting_service.getAllJob_postings();
    }
    @GetMapping(value = "getById")
    public Job_posting getJob_postingById(@RequestParam Integer id) {

        return job_posting_service.getJob_postingById(id);
    }
}
