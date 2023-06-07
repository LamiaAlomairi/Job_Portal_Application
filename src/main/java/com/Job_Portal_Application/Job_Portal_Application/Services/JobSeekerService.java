package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.JobSeeker;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerService {
    @Autowired
    JobSeekerRepository jobSeekerRepository;
    public List<JobSeeker> getAllJob_seekers() {

        return jobSeekerRepository.findAll();
    }

    public JobSeeker getJob_seekerById(Integer id) {

        return jobSeekerRepository.findById(id).get();
    }
}
