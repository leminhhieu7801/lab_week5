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
@Table(name = "candidate_skill")
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "id")
    private Candidate candidate;

    @Column(name = "more_infos", nullable = false)
    private String moreInfos;
    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;
}
