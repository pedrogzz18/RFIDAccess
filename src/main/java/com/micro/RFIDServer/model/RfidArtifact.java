package com.micro.RFIDServer.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name="rfid_artifact")
public class RfidArtifact{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private boolean activo = true;
    private String rfid_code;
    private int residente_id;

    public String getRfid_code() {
        return rfid_code;
    }

    public void setRfid_code(String rfid_code) {
        this.rfid_code = rfid_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getResidente_id() {
        return residente_id;
    }

    public void setResidente_id(int residente_id) {
        this.residente_id = residente_id;
    }
}