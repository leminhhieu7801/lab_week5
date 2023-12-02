package com.example.lab_week5.backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "job_desc", nullable = false)
    private String jobDesc;
    @Column(name = "job_name", nullable = false)
    private String jobName;
    @ManyToOne
    @JoinColumn(name = "id")
    private Company company;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private List<JobSkill> lstJobSkill;



}
