package com.example.lab_week5.backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "company")
public class Company {
    // thằng chứa thằng khác là many
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "about", nullable = false)
    private String about;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "company_name", nullable = false)
    private String companyName;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "weburl", nullable = false)
    private String webURL;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Job> lstJob;

    @ManyToOne
    @JoinColumn(name = "id")
    private Address address;

}
