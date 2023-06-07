package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Application;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class ApplicationService {
    @Autowired
    ApplicationRepository applicationRepository;
    public List<Application> getAllApplications() {

        return applicationRepository.findAll();
    }

    public Application getApplicationById(Integer id) {

        return applicationRepository.findById(id).get();
    }
}
