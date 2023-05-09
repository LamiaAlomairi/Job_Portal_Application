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
@Table(name = "job_seeker")
public class Job_seeker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_seeker_id")
    Integer job_seeker_id;

    @Column(name = "job_seeker_name")
    String job_seeker_name;

    @Column(name = "email")
    String email;

    @Column(name = "phone")
    Integer phone;

    @Column(name = "address")
    String address;

    @OneToMany(mappedBy = "job_seeker")
    @JsonIgnore
    private List<Resume> resumes;

    @OneToMany(mappedBy = "job_seeker")
    @JsonIgnore
    private List<Application> applications;

    @OneToMany(mappedBy = "job_seeker")
    @JsonIgnore
    private List<Interview> interviews;

    @OneToMany(mappedBy = "job_seeker")
    @JsonIgnore
    private List<Notification> notifications;
}
