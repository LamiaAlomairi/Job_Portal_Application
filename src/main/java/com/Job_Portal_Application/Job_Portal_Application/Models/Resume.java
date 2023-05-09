package com.Job_Portal_Application.Job_Portal_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@Data
@Entity
@Table(name = "resume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resume_id")
    Integer resume_id;

    @ManyToOne
    @JoinColumn(name = "job_seeker_id", referencedColumnName = "job_seeker_id")
    private Job_seeker job_seeker;

}
