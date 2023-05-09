package com.Job_Portal_Application.Job_Portal_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    Integer feedback_id;

    String feedback_details;

    @ManyToOne
    @JoinColumn(name = "interview_id", referencedColumnName = "interview_id")
    Interview interview;

}
