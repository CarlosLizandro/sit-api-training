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

    public List<Trainer> getAllTrainings(){
        return this.trainingLot;
    }

    public void addTraining(Trainer trainer){
        this.trainingLot.add(trainer);
    }

}