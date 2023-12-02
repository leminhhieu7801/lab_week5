package com.example.lab_week5.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "experience")
public class Experience {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "from_date", nullable = false)
    private Date fromDate;
    @Column(name = "to_date", nullable = false)
    private Date toDate;
    @Column(name = "role", nullable = false)
    private String role;
    @Column(name = "company", nullable = false)
    private String company;
    @Column(name = "work_desc", nullable = false)
    private String workDesc;

    @ManyToOne
    @JoinColumn(name = "id")
    private Candidate lstCandidate;

}
