package com.micro.RFIDServer.service;
import com.micro.RFIDServer.model.Residente;
import java.util.Optional;

public interface ResidenteService{
    public Residente createResidente(Residente residente);

    public Residente updateResidenteById(Residente new_residente, int id);

    public void deleteResidenteById(int id);

    public Optional<Residente> getResidenteById(int id);
}