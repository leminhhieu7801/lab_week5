package com.example.lab_week5.backend.services;

import com.example.lab_week5.backend.entities.Experience;
import com.example.lab_week5.backend.repositories.ExperienceRepo;
import com.example.lab_week5.backend.services.iservices.IExperienceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService implements IExperienceService {
    private ExperienceRepo experienceRepo;

    public ExperienceService(ExperienceRepo experienceRepo) {
        this.experienceRepo = experienceRepo;
    }

    @Override
    public void Create(Experience exp) {
        experienceRepo.save(exp);
    }

    @Override
    public List<Experience> GetExperiences(List<Long> param) {
        return null;
    }
}
