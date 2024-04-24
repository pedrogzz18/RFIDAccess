package com.micro.RFIDServer.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name="ingreso")
public class Ingreso{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private LocalDate fecha;
    private LocalTime hora;
    private int rfid_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getRfid_id() {
        return rfid_id;
    }

    public void setRfid_id(int rfid_id) {
        this.rfid_id = rfid_id;
    }
}