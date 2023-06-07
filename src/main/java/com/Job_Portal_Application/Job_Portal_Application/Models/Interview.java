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
    Integer id;
    String date;

    @ManyToOne
    @JoinColumn(name = "application_id", referencedColumnName = "id")
    Application application;

    @ManyToOne
    @JoinColumn(name = "jobSeeker_id", referencedColumnName = "id")
    JobSeeker jobSeeker;

    @ManyToOne
    @JoinColumn(name = "jobPosting_id", referencedColumnName = "id")
    JobPosting jobPosting;

    @OneToMany(mappedBy = "interview")
    @JsonIgnore
    List<Feedback> feedbacks;
}
