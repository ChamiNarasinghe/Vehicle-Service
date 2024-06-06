package com.example.web.service;

import com.example.web.models.Part;
import com.example.web.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartService {

    @Autowired
    private PartRepository partRepository;

    public List<Part> getAllParts() {
        return partRepository.findAll();
    }

    public Part addPart(Part part) {
        return partRepository.save(part);
    }
    // Other methods for business logic
}