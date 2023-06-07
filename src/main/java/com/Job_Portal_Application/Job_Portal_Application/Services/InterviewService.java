package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Interview;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewService {
    @Autowired
    InterviewRepository interviewRepository;
    public List<Interview> getAllInterviews() {

        return interviewRepository.findAll();
    }

    public Interview getInterviewById(Integer id) {

        return interviewRepository.findById(id).get();
    }
}
