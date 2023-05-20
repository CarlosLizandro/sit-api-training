package com.training.apitraining.services;

import com.training.apitraining.entities.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    private List<Client> clientLot;

    public ClientService(){
        this.clientLot = new ArrayList<>();
    }
    //TODO: US 01: As a user, I want to be able to see the list of all the clients, so I can have an overview of the current client status.
    public List<Client> getAllClients(){
        return this.clientLot;
    }

    //TODO: US 02 As a user, I want to be able to add a client to the client lot, so I can register a client.
    public void addClient(Client client){
        this.clientLot.add(client);
    }

}

