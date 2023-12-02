package com.example.lab_week5.backend.services.iservices;

import com.example.lab_week5.backend.entities.Candidate;

import java.util.List;

public interface ICandidateService {
    void Create(Candidate candidate);
    List<Candidate> GetCandidates(long param);
}
