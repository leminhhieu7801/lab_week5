package com.example.lab_week5.backend.repositories;

import com.example.lab_week5.backend.entities.CandidateSkill;
import com.example.lab_week5.backend.entities.Job;
import com.example.lab_week5.backend.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<Job, Long> {

    @Query(value = "SELECT * FROM job j join job_skill js on j.id = js.job_id join skill s on js.skill_id = s.id join candidate_skill cs on s.id = cs.candidate_id where cs.job_id = ?1", nativeQuery = true)
    List<Job> job(long id);
}
