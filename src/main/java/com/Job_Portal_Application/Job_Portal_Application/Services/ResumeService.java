package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Resume;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {
    @Autowired
    ResumeRepository resumeRepository;
    public List<Resume> getAllResumes() {

        return resumeRepository.findAll();
    }

    public Resume getResumeById(Integer id) {

        return resumeRepository.findById(id).get();
    }
}
