package com.example.lab_week5.backend.services;

import com.example.lab_week5.backend.entities.Candidate;
import com.example.lab_week5.backend.entities.Job;
import com.example.lab_week5.backend.entities.Skill;
import com.example.lab_week5.backend.repositories.CandidateRepo;
import com.example.lab_week5.backend.repositories.CandidateSkillRepo;
import com.example.lab_week5.backend.repositories.SkillRepo;
import com.example.lab_week5.backend.services.iservices.ICandidateService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CandidateService implements ICandidateService {
    private CandidateRepo candidateRepo;
    private SkillRepo skillRepo;

    public CandidateService(CandidateRepo candidateRepo, SkillRepo skillRepo) {
        this.candidateRepo = candidateRepo;
        this.skillRepo = skillRepo;
    }

    @Override
    public void Create(Candidate candidate) {
        candidateRepo.save(candidate);
    }

    @Override
    public List<Candidate> GetCandidates(long param) {
        List<Skill> jobSkill = skillRepo.jobSkill(param);
        List<Candidate> rs = new ArrayList<Candidate>();
        for (Skill s : jobSkill){
            rs.addAll(candidateRepo.candidate(s.getId()));
        }
        return rs;
    }
}
