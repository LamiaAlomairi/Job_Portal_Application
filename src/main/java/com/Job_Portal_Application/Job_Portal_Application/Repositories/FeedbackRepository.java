package com.Job_Portal_Application.Job_Portal_Application.Repositories;

import com.Job_Portal_Application.Job_Portal_Application.Models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}
