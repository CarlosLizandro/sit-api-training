package com.training.apitraining.entities;

public class Trainer extends Persona{
    private String experiencia;
    private char disponibilidad;

    public Trainer(String nombre, String correoElectronico, Integer telefono, String direccion, Integer DNI, String experiencia, char disponibilidad) {
        super(nombre, correoElectronico, telefono, direccion, DNI);
        this.experiencia = experiencia;
        this.disponibilidad = disponibilidad;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public char getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(char disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
