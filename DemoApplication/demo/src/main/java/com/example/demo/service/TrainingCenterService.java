package com.example.demo.service;

import com.example.demo.model.TrainingCenter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainingCenterService {
    private List<TrainingCenter> trainingCenters = new ArrayList<>();
    private long nextId = 1; // to keep track of the next id

    // Method to add a new training center
    public TrainingCenter addTrainingCenter(String name, String address) {
        TrainingCenter trainingCenter = new TrainingCenter(nextId++, name, address);
        trainingCenters.add(trainingCenter);
        return trainingCenter;
    }

    // Method to retrieve all training centers
    public List<TrainingCenter> getAllTrainingCenters() {
        return trainingCenters;
    }

    // Method to retrieve a training center by ID
    public Optional<TrainingCenter> getTrainingCenterById(Long id) {
        return trainingCenters.stream()
                .filter(tc -> tc.getId().equals(id))
                .findFirst();
    }

    // Method to update a training center
    public Optional<TrainingCenter> updateTrainingCenter(Long id, String name, String address) {
        Optional<TrainingCenter> optionalCenter = getTrainingCenterById(id);
        if (optionalCenter.isPresent()) {
            TrainingCenter trainingCenter = optionalCenter.get();
            trainingCenter.setName(name);
            trainingCenter.setAddress(address);
            return Optional.of(trainingCenter);
        }
        return Optional.empty();
    }

    // Method to delete a training center
    public boolean deleteTrainingCenter(Long id) {
        return trainingCenters.removeIf(tc -> tc.getId().equals(id));
    }
}
