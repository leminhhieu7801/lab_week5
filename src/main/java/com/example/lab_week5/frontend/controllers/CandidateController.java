package com.example.lab_week5.frontend.controllers;

import com.example.lab_week5.backend.entities.Candidate;
import com.example.lab_week5.backend.entities.Job;
import com.example.lab_week5.backend.services.CandidateService;
import com.example.lab_week5.backend.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
    //Load du lieu khong phan trang

    //Load du lieu phan trang

    private CandidateService candidateService;
    private SkillService skillService;

    public CandidateController(CandidateService candidateService, SkillService skillService) {
        this.candidateService = candidateService;
        this.skillService = skillService;
    }

    @GetMapping("/get")
    public List<Candidate> GetRecommend(@RequestParam long jobId){
        return candidateService.GetCandidates(jobId);
    }
}
