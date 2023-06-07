package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Interview;
import com.Job_Portal_Application.Job_Portal_Application.Services.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "interview")
public class InterviewController {
    //    http://localhost:8080/interview/getAll
    @Autowired
    InterviewService interviewService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Interview> getAllInterviews() {

        return interviewService.getAllInterviews();
    }
    @GetMapping(value = "getById")
    public Interview getInterviewById(@RequestParam Integer id) {

        return interviewService.getInterviewById(id);
    }
}
