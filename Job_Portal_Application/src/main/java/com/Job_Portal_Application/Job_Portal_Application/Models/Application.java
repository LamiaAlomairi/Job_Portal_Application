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
@Table(name = "Application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    Integer application_id;

    String application_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "application")
    private Job_seeker jobSeeker;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "application")
    private Job_posting jobPosting;

    @OneToMany(mappedBy = "application")
    @JsonIgnore
    private List<Interview> interviews;
}
