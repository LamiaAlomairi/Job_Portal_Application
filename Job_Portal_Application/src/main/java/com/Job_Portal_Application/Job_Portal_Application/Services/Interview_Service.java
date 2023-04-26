package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Feedback;
import com.Job_Portal_Application.Job_Portal_Application.Models.Interview;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Feedback_Repository;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Interview_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Interview_Service {
    @Autowired
    Interview_Repository interview_repository;
    public List<Interview> getAllInterviews() {

        return interview_repository.findAll();
    }

    public Interview getInterviewById(Integer id) {

        return interview_repository.findById(id).get();
    }
}
