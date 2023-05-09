package com.Job_Portal_Application.Job_Portal_Application.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
import javax.persistence.*;
@Getter
@Setter
@Data
@Entity
@Table(name = "job_posting")
public class Job_posting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_posting_id")
    Integer job_posting_id;

    @Column(name = "job_title")
    String job_title;

    @Column(name = "location")
    String location;

    @Column(name = "salary")
    Double salary;

    @Column(name = "address")
    String address;

    @ManyToOne
    @JoinColumn(name = "employer_id", referencedColumnName = "employer_id")
    Employer employer;

    @OneToMany(mappedBy = "job_posting")
    @JsonIgnore
    private List<Application> applications;

    @OneToMany(mappedBy = "job_posting")
    @JsonIgnore
    private List<Interview> interviews;
}
