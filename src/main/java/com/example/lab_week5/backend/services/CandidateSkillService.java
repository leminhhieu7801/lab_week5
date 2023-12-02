package com.example.lab_week5.backend.services;

import com.example.lab_week5.backend.entities.CandidateSkill;
import com.example.lab_week5.backend.repositories.CandidateSkillRepo;
import com.example.lab_week5.backend.services.iservices.ICandidateSkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateSkillService implements ICandidateSkillService {
    private CandidateSkillRepo skillRepo;

    public CandidateSkillService(CandidateSkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }

    @Override
    public void Create(CandidateSkill candidateSkill) {
        skillRepo.save(candidateSkill);
    }

    @Override
    public List<CandidateSkill> GetCandidateSkills(List<Long> param) {
        return null;
    }
}
