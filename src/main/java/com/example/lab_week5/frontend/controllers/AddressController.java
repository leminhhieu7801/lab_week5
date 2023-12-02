package com.example.lab_week5.frontend.controllers;

import com.example.lab_week5.backend.entities.Address;
import com.example.lab_week5.backend.repositories.AddressRepo;
import com.example.lab_week5.backend.services.AddressService;
import com.example.lab_week5.backend.services.iservices.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/address")
public class AddressController{
    @Autowired
    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }



}
