package com.example.lab_week5.backend.services;

import com.example.lab_week5.backend.entities.Skill;
import com.example.lab_week5.backend.repositories.SkillRepo;
import com.example.lab_week5.backend.services.iservices.IJobSkillService;
import com.example.lab_week5.backend.services.iservices.ISkillService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillService implements ISkillService {

    private SkillRepo skillRepo;

    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }

    @Override
    public void create(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public List<Skill> GetCandidateSkill(long param) {
        return skillRepo.candidateSkill(param);
    }

    @Override
    public List<Skill> GetJobSkill(long param) {
        return skillRepo.jobSkill(param);
    }

    @Override
    public List<Skill> GetAll() {
        return skillRepo.findAll();
    }

    @Override
    public List<Skill> GetRecommend(long candidateId) {
        List<Skill> rs = skillRepo.findAll();
        List<Skill> candidateSkill = skillRepo.candidateSkill(candidateId);
        for (Skill s : rs) {
            for (Skill s1 : candidateSkill) {
                if (s.getId() == s1.getId()) rs.remove(s);
            }
        }
        return rs;
    }
}
