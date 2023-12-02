package com.example.lab_week5.frontend.controllers;

import com.example.lab_week5.backend.entities.Skill;
import com.example.lab_week5.backend.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skill")
public class SkillController {
    @Autowired
    private SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("GetRecommend")
    public List<Skill> GetRecommend(long id){
        return skillService.GetRecommend(id);
    }
}
