package com.Job_Portal_Application.Job_Portal_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@Data
@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String date;

    @ManyToOne
    @JoinColumn(name = "jobSeeker_id", referencedColumnName = "id")
    private JobSeeker jobSeeker;
}
