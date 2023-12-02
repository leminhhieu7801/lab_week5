package com.example.lab_week5.backend.repositories;

import com.example.lab_week5.backend.entities.Address;
import com.example.lab_week5.backend.entities.Candidate;
import com.example.lab_week5.backend.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate, Long> {

    @Query(value = "SELECT * FROM candidate c join candidate_skill cs on c.id = cs.candidate_id join skill s on js.skill_id = s.id join job_skill js on s.id = js.skill_id where js.candidate_id = ?1", nativeQuery = true)
    List<Candidate> candidate(long id);
}
