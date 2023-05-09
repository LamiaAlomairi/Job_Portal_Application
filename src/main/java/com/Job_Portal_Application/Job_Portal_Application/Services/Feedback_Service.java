package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Employer;
import com.Job_Portal_Application.Job_Portal_Application.Models.Feedback;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Employer_Repository;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Feedback_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Feedback_Service {
    @Autowired
    Feedback_Repository feedback_repository;
    public List<Feedback> getAllFeedbacks() {

        return feedback_repository.findAll();
    }

    public Feedback getFeedbackById(Integer id) {

        return feedback_repository.findById(id).get();
    }
}
