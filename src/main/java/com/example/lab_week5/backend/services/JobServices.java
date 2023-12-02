package com.example.lab_week5.backend.services;

import com.example.lab_week5.backend.entities.Job;
import com.example.lab_week5.backend.entities.Skill;
import com.example.lab_week5.backend.repositories.JobRepo;
import com.example.lab_week5.backend.repositories.SkillRepo;
import com.example.lab_week5.backend.services.iservices.IJobServices;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JobServices implements IJobServices {

    private JobRepo jobRepo;
    private SkillRepo skillRepo;

    public JobServices(JobRepo jobRepo, SkillRepo skillRepo) {
        this.jobRepo = jobRepo;
        this.skillRepo = skillRepo;
    }

    @Override
    public void Create(Job job) {
        jobRepo.save(job);
    }

    @Override
    public List<Job> GetJobs(long param) {
        List<Skill> candidateSkill = skillRepo.candidateSkill(param);
        List<Job> rs = new ArrayList<Job>();
        for (Skill s : candidateSkill){
            rs.addAll(jobRepo.job(s.getId()));
        }
        return rs;
    }

}
