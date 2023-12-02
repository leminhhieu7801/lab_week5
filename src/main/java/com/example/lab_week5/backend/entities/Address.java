package com.example.lab_week5.backend.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name = "street", nullable = false)
    private String street;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "country", nullable = false)
    private String country;
    @Column(name = "number", nullable = false)
    private String number;
    @Column(name = "zipcode", nullable = false)
    private String zipcode;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    private List<Company> lstCompany;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    private List<Candidate> lstCandidate;


}
