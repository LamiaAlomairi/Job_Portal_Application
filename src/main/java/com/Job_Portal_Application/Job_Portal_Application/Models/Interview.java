package com.Job_Portal_Application.Job_Portal_Application.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "interview")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interview_id")
    Integer interview_id;

    String interview_date;

    @ManyToOne
    @JoinColumn(name = "application_id", referencedColumnName = "application_id")
    Application application;

    @ManyToOne
    @JoinColumn(name = "job_seeker_id", referencedColumnName = "job_seeker_id")
    Job_seeker job_seeker;

    @ManyToOne
    @JoinColumn(name = "job_posting_id", referencedColumnName = "job_posting_id")
    Job_posting job_posting;

    @OneToMany(mappedBy = "interview")
    @JsonIgnore
    List<Feedback> feedbacks;
}
