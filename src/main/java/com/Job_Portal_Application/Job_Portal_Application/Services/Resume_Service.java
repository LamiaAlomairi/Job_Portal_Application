package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Notification;
import com.Job_Portal_Application.Job_Portal_Application.Models.Resume;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Notification_Repository;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Resume_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Resume_Service {
    @Autowired
    Resume_Repository resume_repository;
    public List<Resume> getAllResumes() {

        return resume_repository.findAll();
    }

    public Resume getResumeById(Integer id) {

        return resume_repository.findById(id).get();
    }
}
