package com.example.web.controller;

import com.example.web.models.Part;
import com.example.web.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parts")
public class PartController {

    @Autowired
    private PartService partService;

    @GetMapping
    public List<Part> getAllParts() {
        return partService.getAllParts();
    }

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<String> addPart(@ModelAttribute Part part) {
        partService.addPart(part);
        return ResponseEntity.ok("Part added successfully.");
    }




}