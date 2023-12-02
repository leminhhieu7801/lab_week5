package com.example.lab_week5.backend.services.iservices;

import com.example.lab_week5.backend.entities.Address;

import java.util.List;

public interface IAddressService {
    void Create(Address address);
    List<Address> GetAddress(List<Long> param);
}
