package com.Job_Portal_Application.Job_Portal_Application.Repositories;

import com.Job_Portal_Application.Job_Portal_Application.Models.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
