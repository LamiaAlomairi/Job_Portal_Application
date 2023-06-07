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
@Table(name = "application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String date;

    @ManyToOne
    @JoinColumn(name = "jobSeeker_id", referencedColumnName = "id")
    JobSeeker jobSeeker;

    @ManyToOne
    @JoinColumn(name = "jobPosting_id", referencedColumnName = "id")
    JobPosting jobPosting;

    @OneToMany(mappedBy = "application")
    @JsonIgnore
    List<Interview> interviews;
}
