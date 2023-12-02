package com.example.lab_week5.backend.repositories;

import com.example.lab_week5.backend.entities.Address;
import com.example.lab_week5.backend.entities.CandidateSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateSkillRepo extends JpaRepository<CandidateSkill, Long> {
}
