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

    public List<Client> getAllClients(){
        return this.clientLot;
    }

    public void addClient(Client client){
        this.clientLot.add(client);
    }
    public void changeCustomerState(int customerId, String newState) {
        // Get the customer from the database.
        Client client = this.clientLot.stream()
                .filter(c -> c.getDNI() == customerId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No se encuentra el cliente"));

        // Cambia el estado actual del cliente
        client.setEstado(client.getEstado());

        // Se guarda el estado del cliente
        this.clientLot.add(client);
    }
}

