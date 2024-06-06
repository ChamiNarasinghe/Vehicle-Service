package com.example.web.repository;

import com.example.web.models.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepository extends JpaRepository<Part, Long> {
    // Add custom query methods if needed
}