package com.example.lab_week5.backend.services.iservices;

import com.example.lab_week5.backend.entities.CandidateSkill;

import java.util.List;

public interface ICandidateSkillService {
    void Create(CandidateSkill candidateSkill);
    List<CandidateSkill> GetCandidateSkills(List<Long> param);
}
