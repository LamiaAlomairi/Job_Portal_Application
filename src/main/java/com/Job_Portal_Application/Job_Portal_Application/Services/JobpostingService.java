package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.JobPosting;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.JobPostingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobpostingService {
    @Autowired
    JobPostingRepository jobPostingRepository;
    public List<JobPosting> getAllJob_postings() {

        return jobPostingRepository.findAll();
    }

    public JobPosting getJob_postingById(Integer id) {

        return jobPostingRepository.findById(id).get();
    }
}
