package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Feedback;
import com.Job_Portal_Application.Job_Portal_Application.Services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "feedback")
public class FeedbackController {
    //    http://localhost:8080/feedback/getAll
    @Autowired
    FeedbackService feedbackService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Feedback> getAllFeedbacks() {

        return feedbackService.getAllFeedbacks();
    }
    @GetMapping(value = "getById")
    public Feedback getFeedbackById(@RequestParam Integer id) {

        return feedbackService.getFeedbackById(id);
    }
}
