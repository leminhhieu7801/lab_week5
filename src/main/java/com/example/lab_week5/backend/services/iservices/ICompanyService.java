package com.example.lab_week5.backend.services.iservices;

import com.example.lab_week5.backend.entities.Company;
import com.example.lab_week5.backend.entities.Experience;

import java.util.List;

public interface ICompanyService {
    void Create(Company company);
    List<Company> GetCompanies(List<Long> param);
}
