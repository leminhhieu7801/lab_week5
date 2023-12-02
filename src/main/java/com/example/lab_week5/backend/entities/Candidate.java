package com.example.lab_week5.backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name = "dob", nullable = false)
    private Date dob;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "fullname", nullable = false)
    private String fullName;
    @Column(name = "phone", nullable = false)
    private String phone;
    @ManyToOne
    @JoinColumn(name = "id")
    private Address address;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<CandidateSkill> lstCandidateSkill;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<Experience> lstExperience;






}
