package com.example.lab_week5.backend.services.iservices;

import com.example.lab_week5.backend.entities.Skill;

import java.util.List;

public interface ISkillService {
    void create(Skill skill);
    List<Skill> GetCandidateSkill(long param);
    List<Skill> GetJobSkill(long param);
    List<Skill> GetAll();
    List<Skill> GetRecommend(long candidateId);
}
