package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Application;
import com.Job_Portal_Application.Job_Portal_Application.Models.Employer;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Application_Repository;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.Employer_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employer_Service {
    @Autowired
    Employer_Repository employer_repository;
    public List<Employer> getAllEmployers() {

        return employer_repository.findAll();
    }

    public Employer getEmployerById(Integer id) {

        return employer_repository.findById(id).get();
    }
}
