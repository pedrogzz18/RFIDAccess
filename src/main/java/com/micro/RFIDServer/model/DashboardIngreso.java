package com.micro.RFIDServer.model;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;


public class DashboardIngreso{
    private int id;
    private LocalDate fecha;
    private LocalTime hora;
    private int residente_id;
    private String residente_nombre;
    private String residente_apellidos;
    private int rfid_id;
    private String rfid_code;

    public DashboardIngreso(int id, LocalDate fecha, LocalTime hora, int residente_id, String residente_nombre,
                            String residente_apellidos, int rfid_id, String rfid_code) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.residente_id = residente_id;
        this.residente_nombre = residente_nombre;
        this.residente_apellidos = residente_apellidos;
        this.rfid_id = rfid_id;
        this.rfid_code = rfid_code;
    }

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

    public int getResidente_id() {
        return residente_id;
    }

    public void setResidente_id(int residente_id) {
        this.residente_id = residente_id;
    }

    public String getResidente_nombre() {
        return residente_nombre;
    }

    public void setResidente_nombre(String residente_nombre) {
        this.residente_nombre = residente_nombre;
    }

    public String getResidente_apellidos() {
        return residente_apellidos;
    }

    public void setResidente_apellidos(String residente_apellidos) {
        this.residente_apellidos = residente_apellidos;
    }

    public int getRfid_id() {
        return rfid_id;
    }

    public void setRfid_id(int rfid_id) {
        this.rfid_id = rfid_id;
    }

    public String getRfid_code() {
        return rfid_code;
    }

    public void setRfid_code(String rfid_code) {
        this.rfid_code = rfid_code;
    }
}