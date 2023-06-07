package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Feedback;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    @Autowired
    FeedbackRepository feedbackRepository;
    public List<Feedback> getAllFeedbacks() {

        return feedbackRepository.findAll();
    }

    public Feedback getFeedbackById(Integer id) {

        return feedbackRepository.findById(id).get();
    }
}
