package com.mycompany.clase17sep;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDateTime;



/**
 *
 * @author hserrano50
 */
import java.time.LocalDateTime;

class Evento {
    long id;
    String nombreEvento;
    LocalDateTime fecha;
    String observaciones;

    public Evento(long id, String nombreEvento, LocalDateTime fecha, String observaciones) {
        this.id = id;
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + nombreEvento + " (" + fecha + ") - " + observaciones;
    }
}

class Nodo {
    Evento evento;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(Evento evento) {
        this.evento = evento;
        this.izquierdo = null;
        this.derecho = null;
    }
}
