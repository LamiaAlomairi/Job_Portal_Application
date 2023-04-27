package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Notification;
import com.Job_Portal_Application.Job_Portal_Application.Models.Resume;
import com.Job_Portal_Application.Job_Portal_Application.Services.Notification_Service;
import com.Job_Portal_Application.Job_Portal_Application.Services.Resume_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "resume")
public class Resume_Controller {
    //    http://localhost:8080/resume/getAll
    @Autowired
    Resume_Service resume_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Resume> getAllResumes() {

        return resume_service.getAllResumes();
    }
    @GetMapping(value = "getById")
    public Resume getResumeById(@RequestParam Integer id) {

        return resume_service.getResumeById(id);
    }
}
