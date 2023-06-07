package com.Job_Portal_Application.Job_Portal_Application.Repositories;

import com.Job_Portal_Application.Job_Portal_Application.Models.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Integer> {
}
