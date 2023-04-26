package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Application;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Application_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class Application_Service {
    @Autowired
    Application_Repository application_repository;
    public List<Application> getAllApplications() {

        return application_repository.findAll();
    }

    public Application getApplicationById(Integer id) {

        return application_repository.findById(id).get();
    }
}
