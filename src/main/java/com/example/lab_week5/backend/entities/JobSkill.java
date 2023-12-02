package com.example.lab_week5.backend.entities;

import com.example.lab_week5.backend.enums.SkillLevel;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "job_skill")
public class JobSkill {
    @Id
    @ManyToOne()
    @JoinColumn(name = "id")
    private Job job;
    @Id
    @ManyToOne
    @JoinColumn(name = "id")
    private Skill skill;
    @Column(name = "more_infos", nullable = false)
    private String moreInfos;
    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;

}
