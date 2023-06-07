package com.Job_Portal_Application.Job_Portal_Application.Repositories;

import com.Job_Portal_Application.Job_Portal_Application.Models.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerRepository extends JpaRepository<JobSeeker, Integer> {
}
