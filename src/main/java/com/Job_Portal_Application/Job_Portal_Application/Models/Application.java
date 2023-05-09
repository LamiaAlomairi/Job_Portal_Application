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
    @Column(name = "application_id")
    Integer application_id;

    String application_date;

    @ManyToOne
    @JoinColumn(name = "job_seeker_id", referencedColumnName = "job_seeker_id")
    Job_seeker job_seeker;

    @ManyToOne
    @JoinColumn(name = "job_posting_id", referencedColumnName = "job_posting_id")
    Job_posting job_posting;

    @OneToMany(mappedBy = "application")
    @JsonIgnore
    List<Interview> interviews;
}
