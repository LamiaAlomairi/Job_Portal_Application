package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Interview;
import com.Job_Portal_Application.Job_Portal_Application.Services.Interview_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "interview")
public class Interview_Controller {
    //    http://localhost:8080/interview/getAll
    @Autowired
    Interview_Service interview_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Interview> getAllInterviews() {

        return interview_service.getAllInterviews();
    }
    @GetMapping(value = "getById")
    public Interview getInterviewById(@RequestParam Integer id) {

        return interview_service.getInterviewById(id);
    }
}
