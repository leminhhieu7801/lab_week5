package com.example.lab_week5.frontend.controllers;

import com.example.lab_week5.backend.entities.Address;
import com.example.lab_week5.backend.entities.Job;
import com.example.lab_week5.backend.entities.JobSkill;
import com.example.lab_week5.backend.services.JobServices;
import com.example.lab_week5.backend.services.JobSkillService;
import com.example.lab_week5.backend.services.iservices.IJobSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/job")
public class JobController {
    @Autowired
    private JobServices jobServices;
    @Autowired
    private IJobSkillService jobSkillService;

    public JobController(JobServices jobServices, IJobSkillService jobSkillService) {
        this.jobServices = jobServices;
        this.jobSkillService = jobSkillService;
    }

    //đăng tin
    @PostMapping("/add")
    public void createJob(@RequestBody Job job, @RequestBody JobSkill skill){
        jobServices.Create(job);
        jobSkillService.Create(skill);
    }

    @GetMapping("/get")
    public List<Job> GetRecommend(@RequestParam long candidateId){
        return jobServices.GetJobs(candidateId);
    }

}
