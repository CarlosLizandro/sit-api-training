package com.training.apitraining.controller;

import com.training.apitraining.entities.Client;
import com.training.apitraining.entities.Trainer;
import com.training.apitraining.services.ClientService;
import com.training.apitraining.services.TrainerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/training")
public class TrainingController {
    private final ClientService clientService;
    private final TrainerService trainerService;

    public TrainingController(ClientService clientService, TrainerService trainerService) {
        this.clientService = clientService;
        this.trainerService = trainerService;
    }

    // GET: http//dominio.training/clients ==> obtener la lista de clientes
    @GetMapping("/clients")
    public ResponseEntity<List<Client>> getAllClients(){
        return ResponseEntity.ok(clientService.getAllClients());
    }

    // POST: http//dominio.training/clients ==> agregar un nuevo cliente
    @PostMapping("/clients")
    public ResponseEntity<Client> addClient(@RequestBody Client client){
        this.clientService.addClient(client);
        return new ResponseEntity<>(client, HttpStatus.CREATED);
    }

    // GET: http//dominio.training/trainers ==> obtener la lista de trainers
    @GetMapping("/trainers")
    public ResponseEntity <List<Trainer>> getAllTrainers(){
        return ResponseEntity.ok(trainerService.getAllTrainings());
    }

    // POST: http//dominio.training/trainers ==> agregar un nuevo trainer
    @PostMapping("/trainers")
    public ResponseEntity<Trainer> addTrainer(@RequestBody Trainer trainer){
        this.trainerService.addTraining(trainer);
        return new ResponseEntity<>(trainer, HttpStatus.CREATED);
    }
}
