package com.example.lab_week5.backend.repositories;

import com.example.lab_week5.backend.entities.CandidateSkill;
import com.example.lab_week5.backend.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepo extends JpaRepository<Skill, Long> {
    @Query(value = "SELECT * FROM skill s join candidate_skill cs on s.id = cs.skill_id join candidate c on cs.candidate_id = c.id", nativeQuery = true)
    List<Skill> candidateSkill(long id);

    @Query(value = "SELECT * FROM skill s join job_skill js on s.id = js.skill_id join job j on js.job_id = j.id", nativeQuery = true)
    List<Skill> jobSkill(long id);
}
