package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Job_posting;
import com.Job_Portal_Application.Job_Portal_Application.Models.Job_seeker;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Job_posting_Repository;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Job_seeker_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Job_seeker_Service {
    @Autowired
    Job_seeker_Repository job_seeker_repository;
    public List<Job_seeker> getAllJob_seekers() {

        return job_seeker_repository.findAll();
    }

    public Job_seeker getJob_seekerById(Integer id) {

        return job_seeker_repository.findById(id).get();
    }
}
