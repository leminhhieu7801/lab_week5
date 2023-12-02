package com.example.lab_week5.backend.services;

import com.example.lab_week5.backend.entities.JobSkill;
import com.example.lab_week5.backend.repositories.JobSkillRepo;
import com.example.lab_week5.backend.services.iservices.IJobSkillService;
import org.springframework.stereotype.Service;

@Service
public class JobSkillService implements IJobSkillService {
    private JobSkillRepo jobSkillRepo;

    public JobSkillService(JobSkillRepo skillRepo) {
        this.jobSkillRepo = skillRepo;
    }

    @Override
    public void Create(JobSkill param) {
        jobSkillRepo.save(param);
    }

    @Override
    public JobSkill GetJobSkill(Long id) {
        return null;
    }
}
