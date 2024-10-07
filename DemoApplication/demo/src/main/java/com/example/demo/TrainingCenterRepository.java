package com.example.demo.repository;

import com.example.demo.model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
    // Additional query methods (if needed) can be defined here
}
