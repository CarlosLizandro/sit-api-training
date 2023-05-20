package com.training.apitraining.entities;

import java.util.List;

public class Miembro extends Client{

    private char estadoDeMembresia;
    private String beneficios;
    private String objetivos;

    private Trainer trainer;

    public Miembro(String nombre, String correoElectronico, Integer telefono, String direccion, Integer DNI, char estadoDeMembresia, String beneficios, String objetivos, Trainer trainer) {
        super(nombre, correoElectronico, telefono, direccion, DNI);
        this.estadoDeMembresia = estadoDeMembresia;
        this.beneficios = beneficios;
        this.objetivos = objetivos;
        this.trainer = trainer;
    }

    public char getEstadoDeMembresia() {
        return estadoDeMembresia;
    }

    public void setEstadoDeMembresia(char estadoDeMembresia) {
        this.estadoDeMembresia = estadoDeMembresia;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
