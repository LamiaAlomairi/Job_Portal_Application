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
@Table(name = "employer")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employer_id")
    Integer employer_id;

    @Column(name = "employer_name")
    String employer_name;

    @Column(name = "email")
    String email;

    @Column(name = "phone")
    Integer phone;

    @Column(name = "address")
    String address;

    @Column(name = "company_name")
    String company_name;

    @OneToMany(mappedBy = "employer")
    @JsonIgnore
    private List<Job_posting> job_postings;

}
