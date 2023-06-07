package com.Job_Portal_Application.Job_Portal_Application.Controllers;

import com.Job_Portal_Application.Job_Portal_Application.Models.Resume;
import com.Job_Portal_Application.Job_Portal_Application.Services.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "resume")
public class ResumeController {
    //    http://localhost:8080/resume/getAll
    @Autowired
    ResumeService resumeService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Resume> getAllResumes() {

        return resumeService.getAllResumes();
    }
    @GetMapping(value = "getById")
    public Resume getResumeById(@RequestParam Integer id) {

        return resumeService.getResumeById(id);
    }
}
