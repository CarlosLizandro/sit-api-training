package com.training.apitraining.services;

import com.training.apitraining.entities.Trainer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainerService {

    private List<Trainer> trainingLot;

    public TrainerService(){
        this.trainingLot = new ArrayList<>();
    }
    //TODO: US 01: As a user, I want to be able to see the list of all the trainings available, so I can have an overview of the current training status.
    public List<Trainer> getAllTrainings(){
        return this.trainingLot;
    }

    //TODO: US 02 As a user, I want to be able to add a training to the training lot, so I can register for a training.
    public void addTraining(Trainer trainer){
        this.trainingLot.add(trainer);
    }

}