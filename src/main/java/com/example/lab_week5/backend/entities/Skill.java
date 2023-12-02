package com.example.lab_week5.backend.entities;

import com.example.lab_week5.backend.enums.SkillType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "skill_desc", nullable = false)
    private String skillDescription;
    @Column(name = "skill_name", nullable = false)
    private String skillName;
    @Column(name = "type", nullable = false)
    private SkillType type;

    @OneToMany(mappedBy = "skill", cascade = CascadeType.ALL)
    private List<JobSkill> lstJobSkill;


}
