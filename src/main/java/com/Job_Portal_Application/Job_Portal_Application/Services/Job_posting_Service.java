package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Interview;
import com.Job_Portal_Application.Job_Portal_Application.Models.Job_posting;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Interview_Repository;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Job_posting_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Job_posting_Service {
    @Autowired
    Job_posting_Repository job_posting_repository;
    public List<Job_posting> getAllJob_postings() {

        return job_posting_repository.findAll();
    }

    public Job_posting getJob_postingById(Integer id) {

        return job_posting_repository.findById(id).get();
    }
}
