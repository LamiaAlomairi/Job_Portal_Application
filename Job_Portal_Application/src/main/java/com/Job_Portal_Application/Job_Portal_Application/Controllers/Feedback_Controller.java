package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Employer;
import com.Job_Portal_Application.Job_Portal_Application.Models.Feedback;
import com.Job_Portal_Application.Job_Portal_Application.Services.Employer_Service;
import com.Job_Portal_Application.Job_Portal_Application.Services.Feedback_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "feedback")
public class Feedback_Controller {
    //    http://localhost:8080/feedback/getAll
    @Autowired
    Feedback_Service feedback_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Feedback> getAllFeedbacks() {

        return feedback_service.getAllFeedbacks();
    }
    @GetMapping(value = "getById")
    public Feedback getFeedbackById(@RequestParam Integer id) {

        return feedback_service.getFeedbackById(id);
    }
}
