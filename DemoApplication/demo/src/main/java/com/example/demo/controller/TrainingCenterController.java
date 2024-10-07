package com.example.demo.controller;

import com.example.demo.model.TrainingCenter;
import com.example.demo.service.TrainingCenterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    private final TrainingCenterService trainingCenterService;

    // Constructor injection for the service
    public TrainingCenterController() {
        this.trainingCenterService = new TrainingCenterService(); // Create a new instance of the service
    }

    // POST API to create and save a new training center
    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@RequestBody TrainingCenter trainingCenter) {
        TrainingCenter createdCenter = trainingCenterService.addTrainingCenter(trainingCenter.getName(), trainingCenter.getAddress());
        return ResponseEntity.ok(createdCenter);
    }

    // GET API to retrieve all training centers
    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = trainingCenterService.getAllTrainingCenters(); // Use the correct method name
        return ResponseEntity.ok(centers);
    }
}
