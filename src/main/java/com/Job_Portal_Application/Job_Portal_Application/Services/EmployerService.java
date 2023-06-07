package com.Job_Portal_Application.Job_Portal_Application.Services;

import com.Job_Portal_Application.Job_Portal_Application.Models.Employer;
import com.Job_Portal_Application.Job_Portal_Application.Repositories.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerService {
    @Autowired
    EmployerRepository employerRepository;
    public List<Employer> getAllEmployers() {

        return employerRepository.findAll();
    }

    public Employer getEmployerById(Integer id) {

        return employerRepository.findById(id).get();
    }
}
