package com.training.apitraining.entities;

public class Client extends Persona{
    private char estado;

    public Client(String nombre, String correoElectronico, Integer telefono, String direccion, Integer DNI, char estado) {
        super(nombre, correoElectronico, telefono, direccion, DNI);
        this.estado = estado;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
}

