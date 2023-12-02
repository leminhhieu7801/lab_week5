package com.example.lab_week5.backend.services;

import com.example.lab_week5.backend.entities.Address;
import com.example.lab_week5.backend.repositories.AddressRepo;
import com.example.lab_week5.backend.services.iservices.IAddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService {
    private AddressRepo addressRepo;

    public AddressService(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @Override
    public void Create(Address address) {
        addressRepo.save(address);
    }

    @Override
    public List<Address> GetAddress(List<Long> param) {
        return null;
    }
}
