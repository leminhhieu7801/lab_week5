package com.example.lab_week5.backend.repositories;

import com.example.lab_week5.backend.entities.CandidateSkill;
import com.example.lab_week5.backend.entities.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepo extends JpaRepository<Experience, Long> {
}
