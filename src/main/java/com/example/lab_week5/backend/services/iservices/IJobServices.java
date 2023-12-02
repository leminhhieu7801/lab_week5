package com.example.lab_week5.backend.services.iservices;

import com.example.lab_week5.backend.entities.Job;

import java.util.List;

public interface IJobServices {
    void Create(Job job);
    List<Job> GetJobs(long param);
}
