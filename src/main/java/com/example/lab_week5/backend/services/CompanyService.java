package com.example.lab_week5.backend.services;

import com.example.lab_week5.backend.entities.Company;
import com.example.lab_week5.backend.repositories.CompanyRepo;
import com.example.lab_week5.backend.services.iservices.ICompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements ICompanyService {
    private CompanyRepo companyRepo;

    public CompanyService(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

    @Override
    public void Create(Company company) {
        companyRepo.save(company);
    }

    @Override
    public List<Company> GetCompanies(List<Long> param) {
        return null;
    }
}
