package com.example.lab_week5.backend.services.iservices;

import com.example.lab_week5.backend.entities.JobSkill;

public interface IJobSkillService {
    void Create(JobSkill param);
    JobSkill GetJobSkill(Long id);
}
