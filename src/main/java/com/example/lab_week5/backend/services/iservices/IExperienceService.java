package com.example.lab_week5.backend.services.iservices;

import com.example.lab_week5.backend.entities.Experience;

import java.util.List;

public interface IExperienceService {
    void Create(Experience exp);
    List<Experience> GetExperiences(List<Long> param);
}
